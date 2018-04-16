package circles;

import java.util.Scanner;

public class PizzaTester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the diameter of your pizza.");
		int diameter = scanner.nextInt();
		System.out.println("Please enter the number of slices in your pizza.");
		int slices = scanner.nextInt();
		System.out.println("Please enter the price of your pizza.");
		double price = scanner.nextDouble();
		
		Circles Pizza = new Circles(diameter/2, "Pizza");
	}
}
