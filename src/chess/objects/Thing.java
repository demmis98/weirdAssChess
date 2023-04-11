package chess.objects;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public abstract class Thing {
	BufferedImage texture;
	int width, height;
	float x, y;
	public Thing(BufferedImage texture, int x, int y) {
		this.x = x;
		this.y = y;
		if(texture != null) {
			width = texture.getWidth();
			height = texture.getHeight();
		}
		else {
			width=0;
			height=0;
		}
	}
	
	public void tick() {};
	public void render(Graphics g) {
		if(texture != null) {
			g.drawImage(texture, (int) x, (int) y, width, height, null);
		}
	};
}