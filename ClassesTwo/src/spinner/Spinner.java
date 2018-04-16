package spinner;

import java.util.Random;

public class Spinner {
	Random r = new Random();
	
	String color;
	int number;
	double balance = 0;
	int diceOne = r.nextInt(6) + 1;
	int diceTwo = r.nextInt(6) + 1;
	int diceThree = r.nextInt(6) + 1;

	public Spinner() {
		number = r.nextInt(9) + 1;
		if ((number == 6) || (number == 7) || (number == 8)) {
			color = "green";
		} else if ((number == 1) || (number == 2) || (number == 3)) {
			color = "red";
		} else if ((number == 4) || (number == 5) || (number == 9)) {
			color = "yellow";
		}
	}

	public void spinIt() {
		number = r.nextInt(9) + 1;
		if ((number == 6) || (number == 7) || (number == 8)) {
			color = "green";
		} else if ((number == 1) || (number == 2) || (number == 3)) {
			color = "red";
		} else if ((number == 4) || (number == 5) || (number == 9)) {
			color = "yellow";
		}
	}

	public String getColor() {
		return color;
	}

	public String getEvenOdd() {
		String evenOdd;
		if (number % 2 == 0) {
			evenOdd = "Even";
		} else {
			evenOdd = "Odd";
		}
		return evenOdd;
	}

	public int getNumber() {
		return number;
	}

	public void balanceWin(int game, double bet) {
		if (game == 0) {
			balance = diceOne + diceTwo;
			balance = balance * bet;
		} else if (game == 1) {
			balance = diceOne + diceTwo + diceThree;
			balance = balance * bet;
		} else {
			balance = diceOne * bet;
		}
	}
	
	public void cardWin(int game) {
		if (game == 0) {
			balance = balance * 2;
		} else if (game == 1) {
			balance = balance * 4;
		} else if (game == 2) {
			balance = balance * 13;
		} else if (game == 3) {
			balance = balance * 52;
		} else {
			balance = diceOne * 13 / 3;
		}
	}

	public void balanceLose(double bet) {
		balance = balance - bet;
	}

	public String printlnLose() {
		return "Sorry bud, but you lost! Your balance is " + balance;
	}
	
	public double getBalance() {
		return balance;
	}

	public String printlnWin() {
		return "You win! Nice job, bro!! Time to roll the dice...\nDice One: " + diceOne + "\nDice Two: " + diceTwo
				+ "\nDice Three: " + diceThree + "\nYour balance is " + balance;
	}

	public String toString() {
		return "/ " + number + " " + color + " /";
	}
}
