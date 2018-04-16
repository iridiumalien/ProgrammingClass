import java.awt.*;

public class Art {

	public static void main(String[] args) {
		int windowWidth = 1000;
		int windowHeight = 800;

		Canvas myCanvas = new Canvas("Canvas");
		myCanvas.setSize(windowWidth, windowHeight);
		myCanvas.setVisible(true);
		Color black = new Color(0, 0, 0);
		myCanvas.fillBackground(black);

		myCanvas.setInkColor(Color.red);
		myCanvas.drawFilledOval(200, 225, 50, 50);
		myCanvas.pause(1000);
		myCanvas.drawFilledOval(400, 225, 50, 50);
		myCanvas.pause(1000);
		myCanvas.drawLine(125, 400, 500, 400);

		// myCanvas.drawString("Welcome to the Geometry Show!",60,80);

	}
}
