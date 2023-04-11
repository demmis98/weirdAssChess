package chess.round;

import chess.All;
import chess.Game;

public class Board {
	Game game;
	All all;
	int width = 0, height = 0;
	byte tiles[][];
	
	public Board (Game game, All all, int innerWidth, int innerHeight
			, int borderWidth, int borderHeight) {
		this.game = game;
		this.all = all;
		width = innerWidth + (2 * borderWidth);
		height = innerHeight + (2 * borderHeight);
		
		tiles = new byte[width][height];

		for(int i = 0; i < width; i++) {
			for(int j = 0; j < height; j++) {
				tiles[i][j] = 0;
			}
		}
		for(int i = borderWidth; i < width - (borderWidth * 2); i++) {
			for(int j = borderHeight; j < height - (borderHeight *2); j++) {
				tiles[i][j] = 0;
			}
		}
	}
}
