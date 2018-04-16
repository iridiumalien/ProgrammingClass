package sheet1;

import java.util.Scanner;

public class Caller {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scanner.next();
		String playAgain = "yes";
		CoffeeMachine coffee = new CoffeeMachine();
		IceCreamMachine iceCream = new IceCreamMachine();
		VendingMachine vending = new VendingMachine();
		Pay machine = new Pay();
		while (playAgain.equals("yes")) {
			playAgain = "no";
			System.out.println("Hello " + name + ". Welcome to the online vending machine server!! :)");
			System.out.println(
					"Which machine would you like to go to?\nEnter '1' for the coffee machine.\nEnter '2' for the ice cream machine."
							+ "\nOR enter '3' for the vending machine!");
			int runner = scanner.nextInt();
			switch (runner) {
			case 1:
				coffee.CoffeeChoice();
				break;
			case 2:
				iceCream.IceCreamChoice();
				break;
			case 3:
				vending.VendingChoice();
				break;
			default:
				System.out.println("That is not a valid option!");
				break;
			}
			machine.PayMethod();

			System.out.println("Enter 'yes' to purchase another item! :D");
			playAgain = scanner.next();
		}
		scanner.close();
		System.out.println("Goodbye, " + name);
	}
}
