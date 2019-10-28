package checkers.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import checkers.models.Game;

import checkers.types.Color;

public class StartControllerTest {

    @Test
    public void givenStartControllerWhenInitGameThenTurnIsForWhites() {
        Game game = new Game();
        StartController startController = new StartController(game);
        startController.start();
        assertEquals(Color.WHITE, startController.getTurn());
    }

}