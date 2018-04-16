package pictures;

import java.util.Scanner;

public class two {
	public static void main(String[] args) {

		// picture one
		System.out.println("Please type two integers!");
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		for (int rows = 0; rows < a; rows++) {
			for (int columns = 0; columns < b; columns++)
				System.out.print("*");
			System.out.println();
		}
		// spacer
		System.out.println();
		System.out.println();

		// picture two
		System.out.println("Please enter an integer and a character!");

		int b2 = scanner.nextInt();
		String a2 = scanner.next();

		for (int rows2 = 1; rows2 <= b2; rows2++) {
			for (int columns2 = 0; columns2 < rows2; columns2++)
				System.out.print(a2);
			System.out.println();
		}

		// spacer
		System.out.println();
		System.out.println();

		// picture three
		System.out.println("Please enter an integer and a character!");

		int b3 = scanner.nextInt();
		String a3 = scanner.next();

		for (int rows3 = 0; rows3 < b3; rows3++) {
			for (int spaces3 = b3 - (rows3 + 1); spaces3 >= 0; spaces3--)
				System.out.print(" ");
			System.out.println(a3);
		}

		// spacer
		System.out.println();
		System.out.println();

		// picture four

		System.out.println("Please enter an integer greater than two!");
		int b4 = scanner.nextInt();
		if (b4 % 2 == 0) {
			System.out.println("Even!!");

			for (int rows4 = 0; rows4 < b4; rows4++) {
				for (int spaces4 = 0; spaces4 < (rows4); spaces4++)
					System.out.print(" ");

				System.out.print("V");

				for (int spaces5 = (-2 * rows4) + 9; spaces5 >= 0; spaces5--)
					System.out.print(" ");

				System.out.println("V");
			}

		} else {
			System.out.println("Odd!!");
			for (int rows4 = 0; rows4 < b4; rows4++) {
				if (rows4 == b4 / 2) {
					for (int plus = 0; plus < b4; plus++)
						System.out.print("+");
					System.out.println();
				} else {
					for (int spaces6 = 0; spaces6 < (b4 / 2); spaces6++)
						System.out.print(" ");
					System.out.println("+");

				}
			}
		}

		scanner.close();
	}
}
