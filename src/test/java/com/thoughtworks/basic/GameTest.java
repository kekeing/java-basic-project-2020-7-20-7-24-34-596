package com.thoughtworks.basic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GameTest {
    @Test
    public void should_return_20_when_given_Competition_score_5_5_5_0() {
        Game game = new Game();
        List<Frame> frames = new ArrayList<>();
        Competition competition1 = new Competition(5);
        Competition competition2 = new Competition(5);
        Competition competition3 = new Competition(5);


    }

}
