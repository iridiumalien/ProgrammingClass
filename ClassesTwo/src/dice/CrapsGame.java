package dice;

import java.util.Scanner;

public class CrapsGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Die first = new Die();
		Die second = new Die();

		System.out.println("How much would you like to bet?");
		double bet = scanner.nextDouble();
		double balance = -1 * bet;

		first.roll();
		second.roll();
		int sum = first.add(second);
		System.out.print(first);
		System.out.println(" " + second);
		System.out.println("Sum: " + sum);

		if ((sum == 7) || (sum == 11)) {
			balance = balance + bet;
			System.out.println("You win!! :)");
			System.out.println("Your balance is " + balance);
		} else if ((sum == 2) || (sum == 3) || (sum == 12)) {
			System.out.println("You lose! :<");
			System.out.println("Your balance is " + balance);
		} else {
			int point = 0;
			while ((first.add(second) != point) && (first.add(second) != 7)) {
				System.out.println("Would you like to bet more money?");
				String additional = scanner.next();
				if (additional.equals("yes")) {
					System.out.println("How much?");
					double addBet = scanner.nextDouble();
					balance = balance - addBet;
					bet = bet + addBet;
				}
				additional = "x";
				point = sum;
				first.roll();
				second.roll();
				first.add(second);
				System.out.print(first);
				System.out.println(" " + second);
			}

			if (first.add(second) == point) {
				balance = 0;
				if ((point == 4) || (point == 10)) {
					balance = (bet * 2) + balance;
				} else if ((point == 5) || (point == 9)) {
					balance = ((bet / 2) * 3) + balance;
				} else if ((point == 6) || (point == 8)) {
					balance = ((bet / 5) * 6) + balance;
				}

				System.out.println("You win!! :)");
				System.out.println("Your balance is " + balance);
			} else {
				System.out.println("You lose! :<");
				System.out.println("Your balance is " + balance);
			}
		}
		scanner.close();
	}
}
