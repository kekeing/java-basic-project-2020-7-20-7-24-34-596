package com.thoughtworks.basic;

import java.util.List;

public class Frame {
    private List<Competition> competitions;
    private int frameScore;

    public int getFrameScore() {
        return frameScore;
    }

    public List<Competition> getCompetitions() {
        return competitions;
    }


    public void setCompetitions(List<Competition> competitions) {
        this.competitions = competitions;
    }

    public void calculateFrameScore() {
        List<Competition> competitions =  this.getCompetitions();
        int result = 0;
        for (Competition competition:
             competitions) {
            result += competition.getScore();
        }
        this.frameScore = result;
    }
}
