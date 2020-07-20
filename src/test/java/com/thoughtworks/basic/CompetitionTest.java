package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

public class CompetitionTest {
    @Test
    public void should_return_score_four_when_attack_4_balls(){
        Competition competition = new Competition();
        int attackBalls = 4;

        competition.attack(attackBalls);

        Assert.assertEquals(competition.getScore(),4);
    }
}
