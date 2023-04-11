package chess.objects;

import chess.All;
import chess.Game;

public class Piece {
	Game game;
	All all;
	char color;
	
	public Piece(Game game, All all, char color) {
		this.game = game;
		this.all = all;
		this.color = color;
	}

}