  
package models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import types.Color;

public class TurnTest {


    @Test
    public void givenTurnWhenCreateTurnThenFirstTurnIsForWhites(){
		Turn turn = new Turn();
		Color turnColor = turn.getTurnColor();
		Color expectedColor = Color.WHITE;
		assertEquals(expectedColor, turnColor);  
    }

    @Test
	public void givenTurnWhenOneTurnIsPlayedThenChangeTurnColorCorrectly() {
		Turn turn = new Turn();
		turn.changeTurn();
		Color resultColor = turn.getTurnColor();
		Color expectedColor = Color.BLACK;
		assertEquals(expectedColor, resultColor);
    }
    
    @Test
	public void givenTurnWhenTwoTurnsArePlayedThenChangeTurnColorTwiceCorrectly() {
		Turn turn = new Turn();
        turn.changeTurn();
        turn.changeTurn();
		Color resultColor = turn.getTurnColor();
		Color expectedColor = Color.WHITE;
		assertEquals(expectedColor, resultColor);
	}


}