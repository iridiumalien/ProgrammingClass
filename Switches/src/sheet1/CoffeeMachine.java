package sheet1;

import java.util.Scanner;

public class CoffeeMachine {
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

	public CoffeeMachine() {
	}
	public void VendingMachine() {
	}

	public void CoffeeChoice() {
		System.out.println(
				"What would you like to buy?\nEnter '1' for a latte.\nEnter '2' for straight coffee.\nOR enter '3' for hot chocolate");
		int choice = scanner.nextInt();
		switch (choice) {
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
	}
}