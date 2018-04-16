package clothes;

import java.util.Scanner;

public class ClothesTester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		clothes clothes1 = new clothes("Sweaters", 7);
		System.out.print(clothes1.getName() + ": ");
		System.out.println(clothes1.getAmount());
		clothes1.addAmount(3);
		System.out.print(clothes1.getName() + ": ");
		System.out.println(clothes1.getAmount());

		clothes clothes2 = new clothes("Socks", 12);
		System.out.print(clothes2.getName() + ": ");
		System.out.println(clothes2.getAmount());
		clothes2.addAmount(4);
		System.out.print(clothes2.getName() + ": ");
		System.out.println(clothes2.getAmount());

		if (clothes2.getAmount() > clothes1.getAmount()) {
			System.out.println("You have more " + clothes2.getName());
		} else if (clothes2.getAmount() < clothes1.getAmount()) {
			System.out.println("You have more " + clothes1.getName());
		}

		scanner.close();
	}
}
