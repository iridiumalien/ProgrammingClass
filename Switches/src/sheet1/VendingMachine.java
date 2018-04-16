package sheet1;

import java.util.Scanner;

public class VendingMachine {
	Scanner scanner = new Scanner(System.in);
	double levelFour = 2.25;
	double levelThree = 2.00;
	double levelFive = 2.50;
	double levelTwo = 1.75;
	double cheap = 0.50;
	double levelOne = 1.50;
	double soda = 1.25;
	double price = 0;
	int pay;
	int choice;
	int machine;
	int candy;
	int chips;
	int drink;
	String playAgain = "yes";

	public VendingMachine() {
	}

	public void VendingChoice() {
		System.out.println("What would you like to buy?\nEnter '1' for chips, '2' for candy, and '3' for a drink");
		choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println(
					"Oooh, good choice!\nWhat would you like to buy?\nEnter '1' for potato chips, '2' for Doritos, and '3' for BBQ!");
			chips = scanner.nextInt();
			switch (chips) {
			case 1:
				System.out.println("That will be $" + levelFour);
				price = levelFour;
				break;
			case 2:
				System.out.println("That will be $" + levelThree);
				price = levelThree;
				break;
			case 3:
				System.out.println("That will be $" + levelFive);
				price = levelFive;
				break;
			default:
				System.out.println("Not a valid option, sorry man. Try again.");
				break;
			}
			break;

		case 2:
			System.out.println(
					"Classic!\nWhat would you like to buy?\nEnter '1' for a chocolate bar, '2' for gum, and '3' for Skittles!");
			candy = scanner.nextInt();
			switch (candy) {
			case 1:
				System.out.println("That will be $" + levelTwo);
				price = levelTwo;
				break;
			case 2:
				System.out.println("That will be $" + cheap);
				price = cheap;
				break;
			case 3:
				System.out.println("That will be $" + levelOne);
				price = levelOne;
				break;
			default:
				System.out.println("Not a valid option, sorry man. Try again.");
				break;
			}
			break;

		case 3:
			System.out.println(
					"A respectable decision!\nWhat would you like to buy?\nEnter '1' for a Coke, '2' for a Root Beer, and '3' for a Sprite!");
			drink = scanner.nextInt();
			switch (drink) {
			case 1:
				System.out.println("That will be $" + soda);
				price = soda;
				break;
			case 2:
				System.out.println("That will be $" + soda);
				price = soda;
				break;
			case 3:
				System.out.println("That will be $" + soda);
				price = soda;
				break;
			default:
				System.out.println("Not a valid option, sorry man. Try again.");
				break;
			}
			break;

		default:
			System.out.println("Not a valid option, sorry man. Try again.");
			break;
		}

	}

}