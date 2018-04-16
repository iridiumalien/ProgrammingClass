
/**
 * This is a Review of Arrays.
 * An 'array' is a list of related information, such as a large database.
 * We locate a value by its 'Index' 
 */
import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int numArray[] = new int[10]; // define an array of integers, size 10
										// array is 'INDEXED' from 0 to 9
		for (int x = 0; x < 10; x++)
			System.out.print(numArray[x] + " "); // print out original array
		System.out.println();

		numArray[0] = 4; // assign values to a particular index
		numArray[3] = 7;
		numArray[6] = 18;
		numArray[8] = numArray[3] + numArray[6];

		for (int x = 0; x < 10; x++)
			System.out.print(numArray[x] + " "); // print out changed array
		System.out.println();

		for (int x = 9; x >= 0; x--)
			System.out.print(numArray[x] + " "); // print in REVERSE order
		System.out.println();

		String color[] = new String[5]; // define an array of Strings, size 5

		for (int g = 0; g <= 4; g++) {
			System.out.print(" Enter color "); // prompt user to enter a color
			color[g] = in.next();
		}

		for (int x = 0; x < 5; x++)
			System.out.print(color[x] + " "); // print out color array
		System.out.println();

		for (int r = 0; r < 5; r++) {
			System.out.print(" ");
			if (color[r].length() < 5) // print out color if length < 5
				System.out.print(color[r]);
			else // else print first character only
				System.out.print(color[r].charAt(0));
		}
		in.close();
	}

}
