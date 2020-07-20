package com.thoughtworks.basic;

import sun.plugin2.gluegen.runtime.CPU;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

public class Game {
    private List<Frame> frames ;

    public Game(List<Frame> frames) {
        this.frames = frames;
    }

    public List<Frame> getFrames() {
        return frames;
    }

    public void setFrames(List<Frame> frames) {
        this.frames = frames;
    }

    public int calculateTotalScore(){
        int result = 0;
        for (int i = 0;i < this.frames.size();i++){
            this.frames.get(i).calculateFrameScore();
            result += this.frames.get(i).getFrameScore();
            if (this.frames.get(i).getIsFullAttack()){
                if (i < this.frames.size() - 1) {
                    result += this.frames.get(i + 1).getCompetitions().get(0).getScore();
                }
            }
        }
        return result;
    }
    public Boolean isOver(){
        if ((this.getUsedTimes() == 20 && frames.get(frames.size() -1).calculateFrameScore() != 10) || this.getUsedTimes() >= 21)
            return true;
        else
            return false;
    }
    public int getUsedTimes(){
        int usedTimes = 0;
        if (frames.size() == 0){return 0;}
        else {
        for (Frame frame : frames){
            usedTimes += frame.getCompetitions().size();
        }
        return   usedTimes;}
    }

    public void attackInGame(int attackBalls) {
        if (isOver()) {
            System.out.println("The game is over");
        } else {
            if (this.getUsedTimes() % 2 == 0 && this.getUsedTimes() != 20){
                Competition competition = new Competition();
                competition.attack(attackBalls);
                Frame frame = new Frame();
                List<Competition> competitions = new ArrayList<>();
                competitions.add(competition);
                frame.setCompetitions(competitions);
                this.frames.add(frame);
            }else{
                Competition competition = new Competition();
                competition.attack(attackBalls);
                List<Competition> competitions = this.frames.get(frames.size() - 1).getCompetitions();
                competitions.add(competition);
                this.frames.get(frames.size() - 1).setCompetitions(competitions);
            }
        }
    }
}
