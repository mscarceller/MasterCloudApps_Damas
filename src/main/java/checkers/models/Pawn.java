package checkers.models;

import checkers.types.Color;

public class Pawn extends Piece {

	public Pawn(Color color) {
		super(color);
	}

	public Color getColor() {
		return null;
	}

	public boolean isDame() {
		return false;
	}

}