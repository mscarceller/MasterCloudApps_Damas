
package models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import models.Board;
import models.Coordinate;
import models.Piece;
import types.Color;

public class BoardTest {

    public BoardTest() {

    }

    private List<Coordinate> initWhitePiecesCoordinates;
    private List<Coordinate> initBlackPiecesCoordinates;
    private List<Coordinate> initEmptySquaresCoordinates;

    @Before
    public void initPiecesCoordinates() {

        initWhitePiecesCoordinates = new ArrayList<Coordinate>(
                Arrays.asList(new Coordinate(0, 0), new Coordinate(2, 0), new Coordinate(4, 0), new Coordinate(6, 0),
                        new Coordinate(1, 1), new Coordinate(3, 1), new Coordinate(5, 1), new Coordinate(7, 1),
                        new Coordinate(0, 2), new Coordinate(2, 2), new Coordinate(4, 2), new Coordinate(6, 2)));

        initBlackPiecesCoordinates = new ArrayList<Coordinate>(
                Arrays.asList(new Coordinate(1, 7), new Coordinate(3, 7), new Coordinate(5, 7), new Coordinate(7, 7),
                        new Coordinate(0, 6), new Coordinate(2, 6), new Coordinate(4, 6), new Coordinate(6, 6),
                        new Coordinate(1, 5), new Coordinate(3, 5), new Coordinate(5, 5), new Coordinate(7, 5)));

        initEmptySquaresCoordinates = new ArrayList<Coordinate>(
                Arrays.asList(new Coordinate(1, 0), new Coordinate(3, 0), new Coordinate(5, 0), new Coordinate(7, 0),
                        new Coordinate(0, 1), new Coordinate(2, 1), new Coordinate(4, 1), new Coordinate(6, 1),
                        new Coordinate(1, 2), new Coordinate(3, 2), new Coordinate(5, 2), new Coordinate(7, 2),
                        new Coordinate(0, 3), new Coordinate(1, 3), new Coordinate(2, 3), new Coordinate(3, 3),
                        new Coordinate(4, 3), new Coordinate(5, 3), new Coordinate(6, 3), new Coordinate(7, 3),
                        new Coordinate(0, 4), new Coordinate(1, 4), new Coordinate(2, 4), new Coordinate(3, 4),
                        new Coordinate(4, 4), new Coordinate(5, 4), new Coordinate(6, 4), new Coordinate(7, 4),
                        new Coordinate(0, 7), new Coordinate(2, 7), new Coordinate(4, 7), new Coordinate(6, 7),
                        new Coordinate(1, 6), new Coordinate(3, 6), new Coordinate(5, 6), new Coordinate(7, 6),
                        new Coordinate(0, 5), new Coordinate(2, 5), new Coordinate(4, 5), new Coordinate(6, 5)));

    }

    @Test
    public void givenBoardWhenCreateBoardThenAllWhitePawnsAreReady() {
        Board board = new Board();
        board.init();
        for (Coordinate coordinate : initWhitePiecesCoordinates) {
            Piece piece = board.getPiece(coordinate);
            assertNotNull(piece);
            assertEquals(Color.WHITE, piece.getColor());
            assertFalse(piece.isDame());
        }
    }

    @Test
    public void givenBoardWhenCreateBoardThenAllBlackPawnsAreReady() {
        Board board = new Board();
        board.init();
        for (Coordinate coordinate : initBlackPiecesCoordinates) {
            Piece piece = board.getPiece(coordinate);
            assertNotNull(piece);
            assertEquals(Color.BLACK, piece.getColor());
            assertFalse(piece.isDame());
        }

    }

    @Test
    public void givenBoardWhenCreateBoardThenNoPiecesInWrongSquares() {
        Board board = new Board();
        board.init();
        for (Coordinate coordinate : initEmptySquaresCoordinates) {
            Piece piece = board.getPiece(coordinate);
            assertNull(piece);
        }
    }

}