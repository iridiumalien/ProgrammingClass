package spinner;

import java.util.Scanner;

import cards.Card;

public class Roulette {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Spinner K = new Spinner();
		Card Z = new Card();

		String color;
		int game;
		double bet;
		int number;
		String evenOdd;
		String suit;
		String suitGuess;
		String typeGuess;
		String faceGuess;
		boolean win = false;

		System.out.println("Hello, User!");
		System.out.println("What would you like to guess?\n"
				+ "\tEnter 0 for the color\n\t1 for the number\n\tOR 2 for even or odd.");
		game = scanner.nextInt();
		System.out.println("How much would you like to bet?");
		bet = scanner.nextDouble();

		switch (game) {
		case 0:
			System.out.println("What color is it going to be -- red, yellow, or green?");
			color = scanner.next();
			if (K.getColor().equals(color)) {
				K.balanceWin(game, bet);
				System.out.println(K.printlnWin());
				win = true;
			} else {
				K.balanceLose(bet);
				System.out.println(K.printlnLose());
			}
			break;
		case 1:
			System.out.println("Enter a number between 1 and 9.");
			number = scanner.nextInt();
			if (K.getNumber() == number) {
				K.balanceWin(game, bet);
				System.out.println(K.printlnWin());
				win = true;
			} else {
				K.balanceLose(bet);
				System.out.println(K.printlnLose());
			}
			break;
		case 2:
			System.out.println("Even or odd?");
			evenOdd = scanner.next();
			if (K.getEvenOdd().equals(evenOdd)) {
				K.balanceWin(game, bet);
				System.out.println(K.printlnWin());
				win = true;
			} else {
				K.balanceLose(bet);
				System.out.println(K.printlnLose());
			}
			break;
		}
		System.out.println(K);

		double balance = K.getBalance();

		if (win == true) {
			System.out.println("BONUS ROUND!!!:\nWhat would you like to guess?\n"
					+ "\tEnter 0 for color\n\t1 for suit\n\t2 for type\n\t3 for exact card\n\tOR 4 for face card.");
			game = scanner.nextInt();

			switch (game) {
			case 0:
				System.out.println("What color? Enter 'Red' or 'Black'.");
				color = scanner.next();
				if ((Z.getColor().equals(color))) {
					balance = balance * 4;
				}
				break;
			case 1:
				System.out.println("What suit? Enter 'Spades', 'Clubs', 'Hearts', or 'Diamonds'.");
				suit = scanner.next();
				if ((Z.getSuit().equals(suit))) {
					balance = balance * 2;
				}
				break;
			case 2:
				System.out.println("What type?");
				typeGuess = scanner.next();
				if (typeGuess.equals(Z.getType())) {
					balance = balance * 13;
				}
				break;
			case 3:
				System.out.println("What suit?");
				suitGuess = scanner.next();
				System.out.println("What type?");
				typeGuess = scanner.next();
				if ((suitGuess.equals(Z.getSuit())) && (typeGuess.equals(Z.getType()))) {
					balance = balance * 52;
				}
				break;
			case 4:
				System.out.println("Enter 'Yes' for a Face Card or 'No' for a Numbered Card?");
				faceGuess = scanner.next();
				if ((faceGuess.equals(Z.getFace()))) {
					balance = (balance * 13 / 3);
				}
				break;
			}
			System.out.println(Z);
			System.out.println("Your new balance is " + balance);
		}
		System.out.println("Goodbye, User!");
		scanner.close();
	}

}
