import java.awt.*;
import javax.swing.JOptionPane;

public class ArtTwo {
	public static void main(String[] args) {
		// Set up the canvas.

		int windowWidth = 1000;
		int windowHeight = 500;
		int kolor, whereX, whereY, across;
		int sizeW, sizeH;
		// Make a 'canvas'

		Canvas myCanvas = new Canvas("Mouse Clicks and Random Applications");

		myCanvas.setSize(windowWidth, windowHeight); // set the size of window screen
		myCanvas.setVisible(true);
		myCanvas.setInkColor(Color.black);
		myCanvas.drawFilledRectangle(0, 0, 1000, 500);
		// myCanvas.fillBackground(Color.black);

		myCanvas.setInkColor(Color.orange); // printing strings on screen
		myCanvas.setFontSize(80);
		myCanvas.drawString("Click", 60, 80);

		myCanvas.pause(1000);

		System.out.println("Click Once on the Canvas and Look for the Pixel!");

		Point pix = myCanvas.waitForClick(); // create a 'point' object

		myCanvas.drawPoint(pix); // method "drawPoint" draws the mouse-clicked point

		System.out.println("You clicked on pixel (" + pix.getX() + ", " + pix.getY() + ")");
		System.out.println("Click once, move mouse, click again...to make line.");

		Point aClick = myCanvas.waitForClick(); // click for a point

		Point bClick = myCanvas.waitForClick(); // click for point #2

		myCanvas.setInkColor(Color.red);

		myCanvas.drawLine(aClick, bClick); // drawLine method w/ Point parameters

		myCanvas.pause(2000);
	}
}
