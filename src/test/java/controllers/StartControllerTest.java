package controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import models.Game;

import types.Color;

public class StartControllerTest {


    @Test
    public void givenStartControllerWhenInitGameThenTurnIsForWhites(){
        Game game = new Game();
        StartController startController = new StartController(game);
        startController.start();
        assertEquals(Color.WHITE, startController.getTurn());
    }


}