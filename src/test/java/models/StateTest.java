package models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StateTest {


@Test
    public void givenStateWhenStateGoFordwardThenStatesFlowIsCorrect(){
        State state = new State();
        assertEquals(StateValue.INITIAL, state.getStateValue());
        state.next();
        assertEquals(StateValue.IN_GAME, state.getStateValue());
        state.next();
        assertEquals(StateValue.FINAL, state.getStateValue());
        state.next();
        assertEquals(StateValue.EXIT, state.getStateValue());   
    }

    @Test
    public void givenStateWhenResetStateThenStateValueisINITIAL(){
        State state = new State();
        state.next();
        state.next();
        state.reset();
        assertEquals(StateValue.INITIAL, state.getStateValue());
    }

    @Test
    public void givenStateWhenSetNewStatethenGetTheSameStateValue(){
        State state = new State();
        state.setState(StateValue.IN_GAME);
        assertEquals(StateValue.IN_GAME, state.getStateValue());
        state.setState(StateValue.FINAL);
        assertEquals(StateValue.FINAL, state.getStateValue());
        state.setState(StateValue.INITIAL);
        assertEquals(StateValue.INITIAL, state.getStateValue());
        state.setState(StateValue.EXIT);
        assertEquals(StateValue.EXIT, state.getStateValue());
    }

}