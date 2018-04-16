package sheet1;

import java.util.Scanner;

public class Pay {
	Scanner scanner = new Scanner(System.in);
	double price = 0;
	int pay;

	public Pay() {
	}

	public void PayMethod() {
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
	}
}
