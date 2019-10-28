package checkers.models;

import checkers.types.Color;

public class Dame extends Piece {

	public Dame(Color color) {
		super(color);
	}

	public Color getColor() {
		return null;
	}

	public boolean isDame() {
		return true;
	}

}