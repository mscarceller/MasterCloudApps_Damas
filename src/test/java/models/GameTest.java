  
package models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import types.Color;


public class GameTest {


    @Test
    public void givenGameWhenInitThenFirstTurnIsWhite(){
        Game game = new Game();
        assertEquals(Color.WHITE, game.getTurn());
    }

    @Test
    public void givenGameWhenChangeTurnThenTurnIsForOpposite(){
        Game game = new Game();
        assertEquals(Color.WHITE, game.getTurn());
        game.changeTurn();
        assertEquals(Color.WHITE, game.getTurn());
        game.changeTurn();
        assertEquals(Color.BLACK, game.getTurn());
    }

}