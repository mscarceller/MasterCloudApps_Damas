package checkers.models;

import checkers.types.Color;

public abstract class Piece {

	public Piece(Color color) {
	}

	public abstract Color getColor();

	public abstract boolean isDame();

}