package chess.sfx;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.FileWriter;
import java.io.IOException;

public class Assets {
	
	private static final int width = 16, height = 16;	//sprite dimensions
	public static final String path = "res/";	//resources path
	private static final String imgPath = path+"img/"; //path to sprites

	public static BufferedImage wTile, bTile;
	public static BufferedImage wPeon, wTorre, wCaballo, wArfil, wRey, wReina;
	
	public boolean semi3D = false;

	public void init(){
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage(imgPath + "sprites.png"));

		wTile = sheet.crop(0, 0, width, height);
		bTile = sheet.crop(width, 0, width, height);
		wPeon = sheet.crop(0, height, width, height);
		wTorre = sheet.crop(width, height, width, height);
		wCaballo = sheet.crop(width * 2, height, width, height);
		wArfil = sheet.crop(width * 3, height, width, height);
		wRey = sheet.crop(width * 4, height, width, height);
		wReina = sheet.crop(width * 5, height, width, height);
	}
	
	public BufferedImage getScaledImage(BufferedImage srcImg, int w, int h){

	    //Create a new image with good size that contains or might contain arbitrary alpha values between and including 0.0 and 1.0.
	    BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TRANSLUCENT);

	    //Create a device-independant object to draw the resized image
	    Graphics2D g2 = resizedImg.createGraphics();

	    //This could be changed, Cf. http://stackoverflow.com/documentation/java/5482/creating-images-programmatically/19498/specifying-image-rendering-quality
	    g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);

	    //Finally draw the source image in the Graphics2D with the desired size.
	    g2.drawImage(srcImg, 0, 0, w, h, null);

	    //Disposes of this graphics context and releases any system resources that it is using
	    g2.dispose();

	    //Return the image used to create the Graphics2D 
	    return resizedImg;
	}

	public void saveFile(String name, String data) {
		try {
	      FileWriter myWriter = new FileWriter(name);
	      myWriter.write(data);
	      myWriter.close();
	      System.out.println("Successfully wrote to the file.");
	    }
		catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	}
	
	public static int getWidth() {
		return width;
	}

	public static int getHeight() {
		return height;
	}

	
}