
package models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import models.Coordinate;
import models.Square;
import types.Color;

public class SquareTest {

    @Test
    public void givenSquareWhenCreateThenSquareIsEmpty() {
        Coordinate squareCoordinates = new Coordinate(3, 5);
        Square square = new Square(squareCoordinates);
        assertNull(square.getPiece());

    }

    @Test
    public void givenSquareWhenMovePieceInsideThenReturnPiece() {
        Coordinate squareCoordinates = new Coordinate(3, 5);
        Square square = new Square(squareCoordinates);
        Pawn pawn = new Pawn(Color.WHITE);
        square.setPiece((Piece) pawn);
        assertEquals(pawn, square.getPiece());
    }

    @Test
    public void givenSquareWhenMovePieceOutSideThenReturnNull() {
        Coordinate squareCoordinates = new Coordinate(3, 5);
        Square square = new Square(squareCoordinates);
        square.removePiece();
        assertNull(square.getPiece());
    }

    @Test
    public void givenSquareWhenMovePieceInOcuppiedSquareThenError() {
        Coordinate squareCoordinates = new Coordinate(3, 5);
        Square square = new Square(squareCoordinates);
        Pawn pawn1 = new Pawn(Color.WHITE);
        Pawn pawn2 = new Pawn(Color.WHITE);
        square.setPiece((Piece) pawn1);
        assertNotNull(square.setPiece((Piece) pawn2));
    }

}