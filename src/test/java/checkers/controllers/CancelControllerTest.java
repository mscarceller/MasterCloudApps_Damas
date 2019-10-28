
package checkers.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import checkers.models.Game;
import checkers.models.StateValue;

public class CancelControllerTest {

    @Test
    public void givenCancelControllerWhenPlayerCancelThenStateIsFinal() {
        Game game = new Game();
        CancelController cancelController = new CancelController();
        cancelController.cancelGame();
        assertEquals(StateValue.FINAL, game.getState());
    }

}