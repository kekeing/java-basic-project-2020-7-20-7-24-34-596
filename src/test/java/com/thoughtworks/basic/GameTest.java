package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GameTest {
    @Test
    public void should_return_20_when_given_Competition_score_5() {
        List<Frame> frames = new ArrayList<>();
        Game game = new Game(frames);

        game.attackInGame(5);

        Assert.assertEquals(5,game.calculateTotalScore());

    }

    @Test
    public void should_return_20_when_given_Competition_score_5_5_5_0() {
        List<Frame> frames = new ArrayList<>();
        Game game = new Game(frames);

        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(0);

        Assert.assertEquals(20,game.calculateTotalScore());

    }
    @Test
    public void should_return_20_when_given_Competition_score_5_number_20() {
        List<Frame> frames = new ArrayList<>();
        Game game = new Game(frames);

        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);


        Assert.assertEquals(145,game.calculateTotalScore());

    }
    @Test
    public void should_return_20_when_given_Competition_score_5_number_21() {
        List<Frame> frames = new ArrayList<>();
        Game game = new Game(frames);

        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);
        game.attackInGame(5);

        int size = game.getFrames().size();
        List<Frame>frames1 = game.getFrames();
        Assert.assertEquals(size,10);
        Assert.assertEquals(game.getUsedTimes(),21);
        Assert.assertEquals(frames1.get(size - 1).getCompetitions().size(),3);
        Assert.assertEquals(150,game.calculateTotalScore());

    }
}
