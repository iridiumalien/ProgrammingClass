package sheet1;

import java.util.Scanner;

public class IceCreamMachine {
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

	public IceCreamMachine() {
	}

	public void IceCreamChoice() {
		System.out.println(
				"What would you like to buy?\nEnter '1' for an ice cream cone.\nEnter '2' for a popsicle.\nOR enter '3' for a Dove bar.");
		choice = scanner.nextInt();
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