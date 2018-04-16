import java.util.Random;
import java.util.Scanner;

public class SpinnerDice {
	public static void main(String[] args) {
		Random r = new Random();
		int dice = 0;
		int spinner;
		String color = null;
		String name;
		double bet;
		int points = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter name");
		name = scanner.next();
		double net;
		double lastNet = 0;
		char replay = 'y';
		int count = 0;
		int win = 0;
		int loss = 0;
		int push = 0;
		String colorGuess = "x";
		int numberGuess = -1;

		System.out.println("Hello, " + name
				+ "\nWould you like to play the traditonal version or the variation? Enter 't' or 'v'!");
		char game = scanner.next().charAt(0);

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
				if (spinner == 0) {
					color = "red";
				} else if (spinner == 1) {
					color = "green";
				} else if (spinner == 2) {
					color = "yellow";
				} else {
					color = "blue";
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
					if (spinner == 0) {
						color = "red";
					} else if (spinner == 1) {
						color = "green";
					} else if (spinner == 2) {
						color = "yellow";
					} else {
						color = "blue";
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
				points = 100 - 5*count;
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
		scanner.close();
	}
}
