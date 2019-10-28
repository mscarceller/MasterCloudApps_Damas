package controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import models.Game;
import models.Coordinate;
import models.Piece;
import types.Color;

public class PlayControllerTest {

    private Coordinate originWhite;
    private Coordinate targetWhite;
    private Coordinate originBlack;
    private Coordinate targetBlack;

    protected void playGameExampleUntilWhiteDame(Game game, PlayController playController) {
        playController.move(new Coordinate(0, 2), new Coordinate(1, 3));
        playController.move(new Coordinate(1, 5), new Coordinate(0, 4));
        playController.move(new Coordinate(2, 2), new Coordinate(3, 3));
        playController.move(new Coordinate(3, 5), new Coordinate(2, 4));
        playController.move(new Coordinate(4, 2), new Coordinate(5, 3));
        playController.move(new Coordinate(5, 5), new Coordinate(4, 4));
        playController.move(new Coordinate(6, 2), new Coordinate(7, 3));
        playController.move(new Coordinate(7, 5), new Coordinate(6, 4));
        playController.move(new Coordinate(1, 3), new Coordinate(3, 5));
        playController.move(new Coordinate(0, 4), new Coordinate(1, 3));
        playController.move(new Coordinate(3, 3), new Coordinate(5, 5));
        playController.move(new Coordinate(0, 6), new Coordinate(1, 5));
        playController.move(new Coordinate(5, 3), new Coordinate(7, 5));
        playController.move(new Coordinate(1, 7), new Coordinate(0, 6));
        playController.move(new Coordinate(3, 5), new Coordinate(1, 7)); // Dama!!
    }

    @Before
    public void initCoordinatesForTests() {
        this.originWhite = new Coordinate(0, 2);
        this.targetWhite = new Coordinate(1, 3);
        this.originBlack = new Coordinate(1, 5);
        this.targetBlack = new Coordinate(2, 4);
    }

    @Test
    public void givenPlayControllerWhenMovementRequiereCorrectThenNotError() {
        Game game = new Game();
        PlayController playController = new PlayController(game);
        assertNull(playController.move(this.originWhite, this.targetWhite));
        assertNull(playController.getPiece(this.originWhite));
        Piece pieceTarget = playController.getPiece(this.targetWhite);
        assertNotNull(pieceTarget);
        assertEquals(pieceTarget.getColor(), Color.WHITE);
    }

    @Test
    public void givenPlayControllerWhenMovementIsOnTheSameSquareThenError() {
        Game game = new Game();
        PlayController playController = new PlayController(game);
        assertNotNull(playController.move(this.originWhite, this.originWhite));
    }

    @Test
    public void givenPlayControllerWhenMoveIncorrectColorPieceThenError() {
        Game game = new Game();
        PlayController playController = new PlayController(game);
        assertNotNull(playController.move(this.originBlack, this.targetBlack));
    }

    @Test
    public void givenPlayControllerWhenMovePieceThenTurnChange() {
        Game game = new Game();
        PlayController playController = new PlayController(game);
        assertEquals(Color.WHITE, playController.getTurn());
        assertNotNull(playController.move(this.originWhite, this.targetWhite));
        assertEquals(Color.BLACK, playController.getTurn());
        assertNotNull(playController.move(this.originBlack, this.targetBlack));
        assertEquals(Color.WHITE, playController.getTurn());

    }

    @Test
    public void givenPlayControllerWhenWhiteIsWinnerThenColorWhite() {
        Game game = new Game();
        PlayController playController = new PlayController(game);
        playGameExampleUntilWhiteDame(game, playController);
        playController.move(new Coordinate(3, 7), new Coordinate(2, 6));
        playController.move(new Coordinate(1, 7), new Coordinate(3, 5));
        playController.move(new Coordinate(6, 6), new Coordinate(4, 4));
        playController.move(new Coordinate(3, 5), new Coordinate(2, 6));
        playController.move(new Coordinate(5, 7), new Coordinate(6, 6));
        playController.move(new Coordinate(2, 6), new Coordinate(0, 4)); // Salto doble
        playController.move(new Coordinate(0, 4), new Coordinate(2, 2));
        playController.move(new Coordinate(0, 6), new Coordinate(1, 5));
        playController.move(new Coordinate(2, 2), new Coordinate(3, 3));
        playController.move(new Coordinate(1, 5), new Coordinate(2, 4));
        playController.move(new Coordinate(7, 5), new Coordinate(5, 7)); // Dama!!
        playController.move(new Coordinate(7, 7), new Coordinate(6, 6));
        playController.move(new Coordinate(5, 7), new Coordinate(3, 5)); // Salto
        playController.move(new Coordinate(3, 5), new Coordinate(1, 3)); // Salto
        playController.move(new Coordinate(6, 6), new Coordinate(7, 5));
        playController.move(new Coordinate(3, 3), new Coordinate(5, 5));
        playController.move(new Coordinate(7, 5), new Coordinate(6, 4));
        playController.move(new Coordinate(7, 1), new Coordinate(6, 2));
        playController.move(new Coordinate(6, 4), new Coordinate(5, 3));
        playController.move(new Coordinate(6, 2), new Coordinate(4, 4));
        assertTrue(game.isFinished());
        assertEquals(Color.WHITE, game.getWinner());
    }

    @Test
    public void givenPlayControllerWhenPieceArriveFinalBoardThenThePieceIsDame() {
        Game game = new Game();
        PlayController playController = new PlayController(game);
        playGameExampleUntilWhiteDame(game, playController);
        Piece pieceWhite = playController.getPiece(new Coordinate(1, 7));
        assertTrue(pieceWhite.isDame());
    }
}