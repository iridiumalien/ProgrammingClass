import java.util.Scanner;

public class ArraysOne {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numArray[] = new int[7]; // define an array of integers, size 10
		char charArray[] = new char[6];
		int y = 3;
		int greatest = 0;
		int greatestLocation = 0;
		int sum = 0;
		int average = 0;
		int z;
		int duplicates = 0;

		// array is 'INDEXED' from 0 to 9
		for (int x = 0; x < numArray.length; x++) {
			numArray[x] = y;
			int three = numArray[3];
			int six = numArray[6];
			numArray[3] = six;
			numArray[6] = three;

			if (x % 2 == 0) {
				numArray[x] = 99;
			}
			if (numArray[x] > greatest) {
				greatest = numArray[x];
				greatestLocation = x;
			}
			sum = sum + numArray[x];
			average = sum / (x + 1);
			System.out.print(numArray[x] + " "); // print out original array
			y = y + 2;
		}
		System.out.println("Greatest = " + greatest + " at " + greatestLocation);
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);
		System.out.println("Enter six characters!");

		for (z = 0; z < 6; z++) {
			charArray[z] = scanner.next().charAt(0);
		}
		System.out.println("Enter a character to be searched");
		char search = scanner.next().charAt(0);
		int flag = 0;
		
		for (int b = 0; b < 6; b++) {
			if (charArray[b] == search) {
				System.out.println("Index: " + b);
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println("Element not found!");
		}
		for (int x = 0; x < 6; x++) {
			for (int l = 0; l < 6; l++) {
				if ((charArray[x] == charArray[l]) && (x != l) && (l > x)) {
					System.out.println("Duplicates at indexes " + x + " and " + l);
					duplicates = 1;
				}
			}
		}
		if (duplicates == 0) {
			System.out.println("No duplicates!");
		}
		System.out.println();
		for (z = 0; z < 6; z++) {
			char one = charArray[0];
			char four = charArray[3];
			charArray[0] = four;
			charArray[3] = one;

			if (z == 0 || z == 5) {
				charArray[z] = 'X';
			}
			if (z == 5) {
				for (int a = 0; a < 6; a++) {
					System.out.print(charArray[a] + " ");
				}
			}
		}

		scanner.close();
	}
}
