
package checkers.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.experimental.categories.Category;
import org.junit.Test;

import checkers.models.StateValue;
import checkers.SmokeTest;

public class LogicTest {

    @Test
    @Category(SmokeTest.class)
    public void givenLogicWhenLogicIsCreatedFirstStateIsINITIAL() {
        Logic logic = new Logic();
        assertEquals(StateValue.INITIAL, logic.getStateValue());
    }

    @Test
    @Category(SmokeTest.class)
    public void givenLogicWhenLogicIsCreatedFirstControllerIsStartController() {
        Logic logic = new Logic();
        assertEquals(AcceptController.class, logic.getController());
        assertTrue(logic.getController() instanceof AcceptController);
    }

    @Test
    public void givenLogicWhenGameStartThenStatesFlowIsCorrect() {
        Logic logic = new Logic();
        assertEquals(StateValue.INITIAL, logic.getStateValue());
        logic.nextState();
        assertEquals(StateValue.IN_GAME, logic.getStateValue());
        logic.nextState();
        assertEquals(StateValue.FINAL, logic.getStateValue());
        logic.nextState();
        assertEquals(StateValue.EXIT, logic.getStateValue());
    }

}