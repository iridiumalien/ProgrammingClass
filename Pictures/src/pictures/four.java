package pictures;

import java.util.Scanner;

public class four {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		/*
		 * picture four Starting up!! :D --->--->--->
		 */

		System.out.println("Please enter an integer greater than two! :D");
		int b4 = scanner.nextInt();
		int A = b4 - 3;

		if (b4 % 2 == 0) {
			System.out.println("Even!!");
			for (int rows = 0; rows < b4 / 2; rows++) {
				for (int spaces = 0; spaces < rows; spaces++)
					System.out.print(" ");

				System.out.print("V");

				for (int spaces5 = (-2 * rows) + A; spaces5 >= 0; spaces5--)
					System.out.print(" ");

				System.out.println("V");
			}

			for (int rows1 = 0; rows1 < b4 / 2; rows1++) {
				for (int spaces5 = (-1 * rows1) + (b4 - 4) / 2; spaces5 >= 0; spaces5--)
					System.out.print(" ");

				System.out.print("V");
				for (int spaces = 0; spaces <= (2 * rows1) - 1; spaces++)
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
