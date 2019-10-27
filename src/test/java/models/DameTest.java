  
package models;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import types.Color;

public class DameTest {

    @Test
    public void givenDameWhenCreatePieceThenReturnIsTrueDame(){
        Piece piece = new Pawn(Color.WHITE);
        assertTrue(piece.isDame()); 
    }

    @Test
    public void givenDameWhenCreatePieceThenReturnCorrectColor(){
        Piece whiteDame = new Pawn(Color.WHITE);
        assertEquals(Color.WHITE, whiteDame.getColor());
        Piece blackDame = new Pawn(Color.BLACK);
        assertEquals(Color.BLACK, blackDame.getColor());
    }
}