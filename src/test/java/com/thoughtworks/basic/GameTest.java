package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GameTest {
    @Test
    public void should_return_20_when_given_Competition_score_5_5_5_0() {
        List<Frame> frames = new ArrayList<>();
        Game game = new Game(frames);

        game.attackInGame(5);

        Assert.assertEquals(5,game.calculateTotalScore());

    }

}
