  
package models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import models.Pawn;
import types.Color;

public class PawnTest {

    @Test
    public void givenPawnWhenCreatePieceThenReturnIsFalseDame(){
        Piece piece = new Pawn(Color.WHITE);
        assertFalse(piece.isDame()); 
    }

    @Test
    public void givenPawnWhenCreatePieceThenReturnCorrectColor(){
        Piece whitePawn = new Pawn(Color.WHITE);
        assertEquals(Color.WHITE, whitePawn.getColor());
        Piece blackPawn = new Pawn(Color.BLACK);
        assertEquals(Color.BLACK, blackPawn.getColor());
    }

}