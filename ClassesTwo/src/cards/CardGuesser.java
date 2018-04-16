package cards;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CardGuesser {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double balance = 0;
		int game;
		double bet;
		String color;
		String suit;
		String suitGuess;
		String typeGuess;
		String faceGuess;
		
		Card One = new Card();
		Card Two = new Card();
		DecimalFormat df = new DecimalFormat("##.##");
		boolean flagOne = false;
		boolean flagTwo = false;

		while (Two.equals(One)) {
			Two.redraw();
		}

		System.out.println("CARD 1:\nWhat would you like to guess?\n"
				+ "\tEnter 0 for color\n\t1 for suit\n\t2 for type\n\t3 for exact card\n\tOR 4 for face card.");
		game = scanner.nextInt();
		System.out.println("How much would you like to bet?");
		bet = scanner.nextDouble();

		switch (game) {
		case 0:
			System.out.println("What color? Enter 'Red' or 'Black'.");
			color = scanner.next();
			if ((One.getColor().equals(color))) {
				balance = bet * 2;
				flagOne = true;
			}
			break;
		case 1:
			System.out.println("What suit? Enter 'Spades', 'Clubs', 'Hearts', or 'Diamonds'.");
			suit = scanner.next();
			if ((One.getSuit().equals(suit))) {
				balance = bet * 4;
				flagOne = true;
			}
			break;
		case 2:
			System.out.println("What type?");
			typeGuess = scanner.next();
			if (typeGuess.equals(One.getType())) {
				balance = bet * 13;
				flagOne = true;
			}
			break;
		case 3:
			System.out.println("What suit?");
			suitGuess = scanner.next();
			System.out.println("What type?");
			typeGuess = scanner.next();
			if ((suitGuess.equals(One.getSuit())) && (typeGuess.equals(One.getType()))) {
				balance = bet * 52;
				flagOne = true;
			}
			break;
		case 4:
			System.out.println("Enter 'Yes' for a Face Card or 'No' for a Numbered Card?");
			faceGuess = scanner.next();
			if ((faceGuess.equals(One.getFace()))) {
				balance = ((bet / 3) * 13);
				flagOne = true;
			}
			break;
		}
		System.out.println("Card 1: ");
		if (flagOne == true) {
			System.out.println(One);
			System.out.println("You win!");
			System.out.println("Your balance is: " + df.format(balance));
		} else if (flagOne == false) {
			balance = balance - bet;
			System.out.println(One);
			System.out.println("You lose!");
			System.out.println("Your balance is: " + df.format(balance));
		}

		System.out.println("CARD 2:\nWhat would you like to guess?\n"
				+ "\tEnter 0 for color\n\t1 for suit\n\t2 for type\n\t3 for exact card\n\tOR 4 for face card.");
		game = scanner.nextInt();
		System.out.println("How much would you like to bet?");
		bet = scanner.nextDouble();

		switch (game) {
		case 0:
			System.out.println("What color? Enter 'Red' or 'Black'.");
			color = scanner.next();
			if ((Two.getColor() == color)) {
				balance = (bet * 2) + balance;
				flagTwo = true;
			}
			break;
		case 1:
			System.out.println("What suit? Enter 'Spades', 'Clubs', 'Hearts', or 'Diamonds'.");
			suit = scanner.next();
			if ((Two.getSuit().equals(suit))) {
				balance = (bet * 4) + balance;
				flagTwo = true;
			}
			break;
		case 2:
			System.out.println("What type?");
			typeGuess = scanner.next();
			if (typeGuess.equals(Two.getType())) {
				balance = (bet * 13) + balance;
				flagTwo = true;
			}
			break;
		case 3:
			System.out.println("What suit?");
			suitGuess = scanner.next();
			System.out.println("What type?");
			typeGuess = scanner.next();
			if ((suitGuess.equals(Two.getSuit())) && (typeGuess.equals(Two.getType()))) {
				balance = (bet * 52) + balance;
				flagTwo = true;
			}
			break;
		case 4:
			System.out.println("Enter 'Yes' for a Face Card or 'No' for a Numbered Card?");
			faceGuess = scanner.next();
			if ((faceGuess.equals(Two.getFace()))) {
				balance = ((bet / 3) * 13) + balance;
				flagTwo = true;
			}
			break;
		}

		System.out.println("Card 2: ");
		if (flagTwo == true) {
			System.out.println(Two);
			System.out.println("You win!");
			System.out.println("Your balance is: " + df.format(balance));
		} else if (flagTwo == false) {
			balance = balance - bet;
			System.out.println(Two);
			System.out.println("You lose!");
			System.out.println("Your balance is: " + df.format(balance));
		}
		scanner.close();
	}
}
