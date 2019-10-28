
package controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import models.Game;
import models.Pawn;
import models.Coordinate;
import models.Piece;
import types.Color;

public class MoveControllerTest {

    private Coordinate originWhite;
    private Coordinate targetWhite;
    private Coordinate wrongTargetWhite;

    @Before
    public void initCoordinatesForTests(){
        this.originWhite = new Coordinate(2, 2);
        this.targetWhite = new Coordinate(1, 3);
        this.wrongTargetWhite = new Coordinate(2,3);
    }

    @Test
    public void givenMoveControllerWhenMovementRequiereCorrectThenNotError() {
        Game game = new Game();
        MoveController moveController = new MoveController(game);
        Pawn piece = new Pawn(Color.WHITE);
        moveController.setPiece(piece,this.originWhite);
        assertNull(moveController.move(this.originWhite, this.targetWhite));
        assertNull(moveController.getPiece(this.originWhite));
        Piece pieceTarget = moveController.getPiece(this.targetWhite);
        assertNotNull(pieceTarget);
        assertEquals(pieceTarget.getColor(), Color.WHITE);
    }

    @Test
    public void givenMoveControllerWhenMovementIsOnTheSameSquareThenError(){
        Game game = new Game();
        MoveController moveController = new MoveController(game);
        Pawn piece = new Pawn(Color.WHITE);
        moveController.setPiece(piece,this.originWhite);
        assertNotNull(moveController.move(this.originWhite,this.originWhite));
    }

    @Test
    public void givenMoveControllerWhenIllegalMovementThenError(){
        Game game = new Game();
        MoveController moveController = new MoveController(game);
        assertNotNull(moveController.move(this.originWhite, this.wrongTargetWhite));
    }

}