package cards;

import java.util.Random;

public class Card {
	private String suit;
	private String type;
	Random r = new Random();

	// clubs, spades, hearts, diamonds
	public Card() {
		int suitChooser = r.nextInt(4);
		int typeChooser = r.nextInt(13);
		if (suitChooser == 0) {
			suit = "Spades";
		} else if (suitChooser == 1) {
			suit = "Clubs";
		} else if (suitChooser == 2) {
			suit = "Hearts";
		} else if (suitChooser == 3) {
			suit = "Diamonds";
		}

		if (typeChooser == 0) {
			type = "Ace";
		} else if (typeChooser == 1) {
			type = "2";
		} else if (typeChooser == 2) {
			type = "3";
		} else if (typeChooser == 3) {
			type = "4";
		} else if (typeChooser == 4) {
			type = "5";
		} else if (typeChooser == 5) {
			type = "6";
		} else if (typeChooser == 6) {
			type = "7";
		} else if (typeChooser == 7) {
			type = "8";
		} else if (typeChooser == 8) {
			type = "9";
		} else if (typeChooser == 9) {
			type = "10";
		} else if (typeChooser == 10) {
			type = "Jack";
		} else if (typeChooser == 11) {
			type = "Queen";
		} else if (typeChooser == 12) {
			type = "King";
		}
	}

	public void redraw() {
		int suitChooser = r.nextInt(4);
		int typeChooser = r.nextInt(13);
		if (suitChooser == 0) {
			suit = "Spades";
		} else if (suitChooser == 1) {
			suit = "Clubs";
		} else if (suitChooser == 2) {
			suit = "Hearts";
		} else if (suitChooser == 3) {
			suit = "Diamonds";
		}

		if (typeChooser == 0) {
			type = "Ace";
		} else if (typeChooser == 1) {
			type = "2";
		} else if (typeChooser == 2) {
			type = "3";
		} else if (typeChooser == 3) {
			type = "4";
		} else if (typeChooser == 4) {
			type = "5";
		} else if (typeChooser == 5) {
			type = "6";
		} else if (typeChooser == 6) {
			type = "7";
		} else if (typeChooser == 7) {
			type = "8";
		} else if (typeChooser == 8) {
			type = "9";
		} else if (typeChooser == 9) {
			type = "10";
		} else if (typeChooser == 10) {
			type = "Jack";
		} else if (typeChooser == 11) {
			type = "Queen";
		} else if (typeChooser == 12) {
			type = "King";
		}
	}

	public String getSuit() {
		return suit;
	}

	public String getType() {
		return type;
	}

	public String getCard() {
		return type + " of " + suit;
	}

	public String getColor() {
		String color = "x";
		if ((this.getSuit() == "Hearts") || (this.getSuit() == "Diamonds")) {
			color = "Red";
		} else {
			color = "Black";
		}
		return color;
	}
	
	public String getFace() {
		String face = "x";
		if (this.getType().equals("Queen") || this.getType().equals("King") || this.getType().equals("Jack")) {
			face = "Yes";
		} else {
			face = "No";
		}
		return face;
	}

	public String toString() {
		return "< " + suit + ", " + type + " >";
	}
}
