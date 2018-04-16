package sheet1;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		// variable declarations
		String name = scanner.next();
		int choice;
		int machine;
		int candy;
		int chips;
		int drink;
		double levelFour = 2.25;
		double levelThree = 2.00;
		double levelFive = 2.50;
		double levelTwo = 1.75;
		double cheap = 0.50;
		double levelOne = 1.50;
		double soda = 1.25;
		double price = 0;
		int pay;
		String playAgain = "yes";

		while (playAgain == "yes") {
			playAgain = "no";
			System.out.println("Hello " + name + ". Welcome to the online vending machine server!! :)");

			System.out.println(
					"Which machine would you like to go to?\nEnter '1' for the coffee machine.\nEnter '2' for the ice cream machine."
							+ "\nOR enter '3' for the vending machine!");
			machine = scanner.nextInt();
			// machine chooser
			switch (machine) {
			// coffee loop
			case 1:
				System.out.println(
						"What would you like to buy?\nEnter '1' for a latte.\nEnter '2' for straight coffee.\nOR enter '3' for hot chocolate");
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
				// ice cream loop
			case 2:
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
				break;
			// regular vending machine
			case 3:
				System.out.println(
						"What would you like to buy?\nEnter '1' for chips, '2' for candy, and '3' for a drink");
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
				break;
			}
			if (price != 0) {
				System.out.println(
						"How would you like to pay?\nEnter '1' for a credit card, '2' for a $5 bill, or '3' for with change!");
				pay = scanner.nextInt();
				switch (pay) {
				case 1:
					System.out.println("What kinda guy pays with a credit card? Alright then...");
					break;
				case 2:
					System.out.println("Your change is " + (5.0 - price));
					break;
				case 3:
					System.out.println("That's an awful lot of change, buddy!");
					break;
				default:
					System.out.println("Not a valid option, sorry man. Try again.");
					break;
				}
			}
			System.out.println("Would you like to make another purchase?");
			playAgain = scanner.next();
		}
		scanner.close();
		System.out.println("Goodbye, " + name);
	}
}