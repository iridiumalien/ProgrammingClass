import java.awt.Color;

import java.util.Random;
import java.util.Scanner;

public class SpinnerDiceGraphics {

	public static void main(String[] args) {
		int windowWidth = 1000;
		int windowHeight = 800;
		Random r = new Random();
		int dice = 0;
		int spinner;
		String color = null;
		String name;
		double bet;
		int points = 0;
		Scanner scanner = new Scanner(System.in);
		Canvas myCanvas = new Canvas("Canvas");
		myCanvas.setSize(windowWidth, windowHeight);
		myCanvas.setVisible(true);
		Color black = new Color(0, 0, 0);
		myCanvas.fillBackground(black);

		System.out.println("Enter name");
		name = scanner.next();

		System.out.println("Hello, " + name
				+ "\nWould you like to play the traditonal version or the variation? Enter 't' or 'v'!");
		char game = scanner.next().charAt(0);

		double net;
		double lastNet = 0;
		char replay = 'y';
		int count = 0;
		int win = 0;
		int loss = 0;
		int push = 0;
		String colorGuess = "x";
		int numberGuess = -1;

		if (game == 't') {
			System.out.println("Hello, " + name + "\nHow much would you like to bet?");
			bet = scanner.nextDouble();
			net = bet;
			double total = bet;

			while (replay == 'y') {
				if (count > 0) {
					System.out.println("Hello, " + name + "\nHow much would you like to bet?");
					bet = scanner.nextDouble();
				}
				count++;
				dice = r.nextInt(6) + 1;
				spinner = r.nextInt(4);
				replay = 'n';
				// colors
				myCanvas.setInkColor(Color.red);
				myCanvas.drawFilledRectangle(650, 250, 125, 125);
				myCanvas.pause(200);
				myCanvas.setInkColor(Color.green);
				myCanvas.drawFilledRectangle(650, 375, 125, 125);
				myCanvas.pause(200);
				myCanvas.setInkColor(Color.yellow);
				myCanvas.drawFilledRectangle(775, 250, 125, 125);
				myCanvas.pause(200);
				myCanvas.setInkColor(Color.blue);
				myCanvas.drawFilledRectangle(775, 375, 125, 125);
				myCanvas.pause(200);

				myCanvas.setInkColor(Color.white);
				myCanvas.drawFilledRectangle(100, 250, 250, 250);
				myCanvas.pause(200);

				myCanvas.setInkColor(Color.black);
				if (spinner == 0) {
					color = "red";
					myCanvas.drawLine(650, 250, 775, 375);
					myCanvas.drawLine(775, 250, 650, 375);
				} else if (spinner == 1) {
					color = "green";
					myCanvas.drawLine(650, 375, 775, 500);
					myCanvas.drawLine(775, 375, 650, 500);
				} else if (spinner == 2) {
					color = "yellow";
					myCanvas.drawLine(775, 250, 900, 375);
					myCanvas.drawLine(900, 250, 775, 375);
				} else {
					color = "blue";
					myCanvas.drawLine(775, 375, 900, 500);
					myCanvas.drawLine(900, 375, 775, 500);
				}
				myCanvas.setInkColor(Color.blue);

				if (dice == 1) {
					myCanvas.drawFilledOval(200, 350, 45, 45);
				} else if (dice == 2) {
					myCanvas.drawFilledOval(150, 300, 45, 45);
					myCanvas.drawFilledOval(250, 400, 45, 45);
				} else if (dice == 3) {
					myCanvas.drawFilledOval(125, 275, 45, 45);
					myCanvas.drawFilledOval(200, 350, 45, 45);
					myCanvas.drawFilledOval(275, 425, 45, 45);
				} else if (dice == 4) {
					myCanvas.drawFilledOval(150, 300, 45, 45);
					myCanvas.drawFilledOval(250, 400, 45, 45);
					myCanvas.drawFilledOval(150, 400, 45, 45);
					myCanvas.drawFilledOval(250, 300, 45, 45);
				} else if (dice == 5) {
					myCanvas.drawFilledOval(125, 275, 45, 45);
					myCanvas.drawFilledOval(200, 350, 45, 45);
					myCanvas.drawFilledOval(125, 425, 45, 45);
					myCanvas.drawFilledOval(275, 275, 45, 45);
					myCanvas.drawFilledOval(275, 425, 45, 45);
				} else {
					myCanvas.drawFilledOval(150, 275, 45, 45);
					myCanvas.drawFilledOval(150, 355, 45, 45);
					myCanvas.drawFilledOval(150, 435, 45, 45);
					myCanvas.drawFilledOval(250, 275, 45, 45);
					myCanvas.drawFilledOval(250, 355, 45, 45);
					myCanvas.drawFilledOval(250, 435, 45, 45);
				}

				// spinner
				System.out.println("Spinner: " + color);
				System.out.println("Dice: " + dice);
				if (count > 1) {
					total = total + bet;
				}
				if ((color == "blue" || color == "green") && (dice % 2 == 0)) {
					System.out.println("Congrats, " + name + ". You win :D!");
					win++;
				} else if (color == "red" && dice == 1) {
					System.out.println("Sorry, " + name + ", but it appears that you've lost.");
					bet = bet * -1;
					loss++;
				} else {
					System.out.println("It's a push.");
					bet = 0;
					push++;
				}
				net = bet + lastNet;
				lastNet = net;
				System.out.println("You have bet $" + total);
				System.out.println("Your net total is $" + net);
				System.out.println("You have played: " + count + " times!");
				System.out.println("You have " + win + " wins, " + loss + " losses, and " + push + " pushes!");

				System.out.println("Play again? Press 'y' to continue!");
				replay = scanner.next().charAt(0);
			}

		} else if (game == 'v') {
			while (replay == 'y') {
				replay = 'n';
				colorGuess = "y";
				numberGuess = -5;
				while ((colorGuess != color) && (numberGuess != dice)) {
					count++;
					dice = r.nextInt(6) + 1;
					spinner = r.nextInt(4);

					// colors
					myCanvas.setInkColor(Color.red);
					myCanvas.drawFilledRectangle(650, 250, 125, 125);
					myCanvas.pause(200);
					myCanvas.setInkColor(Color.green);
					myCanvas.drawFilledRectangle(650, 375, 125, 125);
					myCanvas.pause(200);
					myCanvas.setInkColor(Color.yellow);
					myCanvas.drawFilledRectangle(775, 250, 125, 125);
					myCanvas.pause(200);
					myCanvas.setInkColor(Color.blue);
					myCanvas.drawFilledRectangle(775, 375, 125, 125);
					myCanvas.pause(200);

					myCanvas.setInkColor(Color.white);
					myCanvas.drawFilledRectangle(100, 250, 250, 250);
					myCanvas.pause(200);

					myCanvas.setInkColor(Color.black);
					if (spinner == 0) {
						color = "red";
						myCanvas.drawLine(650, 250, 775, 375);
						myCanvas.drawLine(775, 250, 650, 375);
					} else if (spinner == 1) {
						color = "green";
						myCanvas.drawLine(650, 375, 775, 500);
						myCanvas.drawLine(775, 375, 650, 500);
					} else if (spinner == 2) {
						color = "yellow";
						myCanvas.drawLine(775, 250, 900, 375);
						myCanvas.drawLine(900, 250, 775, 375);
					} else {
						color = "blue";
						myCanvas.drawLine(775, 375, 900, 500);
						myCanvas.drawLine(900, 375, 775, 500);
					}
					myCanvas.setInkColor(Color.blue);

					if (dice == 1) {
						myCanvas.drawFilledOval(200, 350, 45, 45);
					} else if (dice == 2) {
						myCanvas.drawFilledOval(150, 300, 45, 45);
						myCanvas.drawFilledOval(250, 400, 45, 45);
					} else if (dice == 3) {
						myCanvas.drawFilledOval(125, 275, 45, 45);
						myCanvas.drawFilledOval(200, 350, 45, 45);
						myCanvas.drawFilledOval(275, 425, 45, 45);
					} else if (dice == 4) {
						myCanvas.drawFilledOval(150, 300, 45, 45);
						myCanvas.drawFilledOval(250, 400, 45, 45);
						myCanvas.drawFilledOval(150, 400, 45, 45);
						myCanvas.drawFilledOval(250, 300, 45, 45);
					} else if (dice == 5) {
						myCanvas.drawFilledOval(125, 275, 45, 45);
						myCanvas.drawFilledOval(200, 350, 45, 45);
						myCanvas.drawFilledOval(125, 425, 45, 45);
						myCanvas.drawFilledOval(275, 275, 45, 45);
						myCanvas.drawFilledOval(275, 425, 45, 45);
					} else {
						myCanvas.drawFilledOval(150, 275, 45, 45);
						myCanvas.drawFilledOval(150, 355, 45, 45);
						myCanvas.drawFilledOval(150, 435, 45, 45);
						myCanvas.drawFilledOval(250, 275, 45, 45);
						myCanvas.drawFilledOval(250, 355, 45, 45);
						myCanvas.drawFilledOval(250, 435, 45, 45);
					}

					System.out.println("Okay, " + name + "\nWhich color is it going to be? Red? Green? Blue? Yellow?");
					colorGuess = scanner.next();
					System.out.println("Which number is it going to be?");
					numberGuess = scanner.nextInt();

					if ((colorGuess != color) && (numberGuess != dice)) {
						System.out.println("INCORRECT!\nYou guessed: " + colorGuess + " and the answer is: " + color);
						System.out.println("You guessed: " + numberGuess + " and the answer is: " + dice);
						System.out.println("Looks like you will have to keep trying!");
					}
				}
				// spinner
				points = 100 - 5 * count;
				System.out.println("CORRECT!\nYou guessed: " + colorGuess + " and the answer is: " + color);
				System.out.println("You guessed: " + numberGuess + " and the answer is: " + dice);
				System.out.println();
				System.out.println("You have earned " + points + " points!");
				System.out.println("Play again? Press 'y' to continue!");
				replay = scanner.next().charAt(0);
			}
		} else {
			System.out.println("Sorry, that is not a valid game option.");
		}
		System.out.println("Goodbye, " + name);
		// myCanvas.drawString("Welcome to the Geometry Show!",60,80);
		scanner.close();
	}
}
