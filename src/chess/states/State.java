package chess.states;

import java.awt.Graphics;

import chess.All;

public abstract class State {
	private All all;
	public State(All all) {
		this.all = all;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
}
