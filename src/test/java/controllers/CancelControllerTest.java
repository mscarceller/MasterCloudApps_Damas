
package controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import models.Game;
import models.StateValue;

public class CancelControllerTest {

    @Test
    public void givenCancelControllerWhenPlayerCancelThenStateIsFinal() {
        Game game = new Game();
        CancelController cancelController = new CancelController();
        cancelController.cancelGame();
        assertEquals(StateValue.FINAL, game.getState());
    }

}