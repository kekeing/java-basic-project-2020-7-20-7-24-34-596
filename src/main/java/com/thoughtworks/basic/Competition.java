package com.thoughtworks.basic;

public class Competition {
    int score;

    public void attack(int attackBalls) {
        this.score  = attackBalls;
    }

    public int getScore() {
        return this.score;
    }

    public Competition(int score) {
        this.score = score;
    }

    public Competition() {
    }
}
