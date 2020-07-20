package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FrameTest {
    @Test
    public void should_return_frame_score_10_when_given_Competions_score_is_4_and_6(){
        Frame frame = new Frame();
        Competition competition1 = new Competition(4);
        Competition competition2 = new Competition(6);
        List<Competition> competitions = new ArrayList<>();
        competitions.add(competition1);
        competitions.add(competition2);
        frame.setCompetitions(competitions);

        frame.calculateFrameScore();

        Assert.assertEquals(10,frame.getFrameScore());

    }
}
