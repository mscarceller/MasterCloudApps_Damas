package checkers.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import checkers.models.Game;
import checkers.models.StateValue;

public class ResumeControllerTest {

    @Test
    public void givenResumeControllerWhenResumeGameThenStateIsInitalState() {
        Game game = new Game();
        ResumeController resumeController = new ResumeController(game);
        resumeController.isNewGame(true);
        assertEquals(resumeController.getState(), StateValue.INITIAL);
    }

}