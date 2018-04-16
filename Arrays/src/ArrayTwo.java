import java.util.Random;
import java.util.Scanner;

public class ArrayTwo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();

		int firstInt[] = new int[5];
		int secondInt[] = new int[5];
		int sumInt[] = new int[5];
		int largerInt[] = new int[5];
		int combineInt[] = new int[15];

		System.out.print("Array One: ");
		for (int x = 0; x < 5; x++) {
			firstInt[x] = r.nextInt(49) + 1;
			System.out.print(firstInt[x] + " ");
		}
		System.out.println();
		System.out.println("Please enter five integers.");
		for (int y = 0; y < 5; y++) {
			secondInt[y] = scanner.nextInt();
			if (y == 4) {
				System.out.print("Array Two: ");
				for (int a = 0; a < 5; a++) {
					System.out.print(secondInt[a] + " ");
				}
			}
		}
		System.out.println();
		System.out.print("Sum Array: ");
		for (int z = 0; z < 5; z++) {
			sumInt[z] = firstInt[z] + secondInt[z];
			System.out.print(sumInt[z] + " ");
		}
		System.out.println();
		System.out.print("Larger Int Array: ");
		for (int b = 0; b < 5; b++) {
			boolean equal = false;
			if (secondInt[b] > firstInt[b]) {
				largerInt[b] = secondInt[b];
			} else if (secondInt[b] < firstInt[b]) {
				largerInt[b] = firstInt[b];
			} else if (secondInt[b] == firstInt[b]) {
				equal = true;
			}
			if (equal == false) {
				System.out.print(largerInt[b] + " ");
			} else {
				System.out.print("x ");
			}
		}
		System.out.println();
		System.out.print("Combined Array: ");
		for (int z = 0; z < 15; z++) {
			if (z < 5) {
				combineInt[z] = firstInt[z];
			} else if (z >= 5 && z < 10) {
				combineInt[z] = secondInt[z - 5];
			} else if (z >= 10 && z < 15) {
				combineInt[z] = sumInt[z - 10];
			}
			System.out.print(combineInt[z] + " ");
		}
		System.out.println();
		System.out.print("Reversed Combined Array: ");
		for (int z = 14; z >= 0; z--) {
			if (z < 5) {
				combineInt[z] = firstInt[z];
			} else if (z >= 5 && z < 10) {
				combineInt[z] = secondInt[z - 5];
			} else if (z >= 10 && z < 15) {
				combineInt[z] = sumInt[z - 10];
			}
			System.out.print(combineInt[z] + " ");
		}
		
		scanner.close();
	}
}
