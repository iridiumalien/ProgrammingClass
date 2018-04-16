package pictures;

import java.util.Scanner;

public class HistogramTwo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter four numbers between 0 and 5.");
		int columns[] = new int[4];

		for (int x = 0; x < 4; x++) {
			columns[x] = scanner.nextInt();
		}

		for (int x = 5; x > 0; x--) {
			for (int y = 0; y < 4; y++) {
				if (columns[y] < x) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		scanner.close();
	}
}
