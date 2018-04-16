import java.util.Scanner;

public class ArrayThree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String foodArray[] = new String[6];
		boolean equalsNoodles = false;
		boolean searchValidity = false;

		System.out.println("Enter six foods!");
		for (int x = 0; x < 6; x++) {
			foodArray[x] = scanner.nextLine();
		}
		System.out.print("All Foods Before Noodles:\n");
		for (int x = 0; x < 6; x++) {
			if (foodArray[x].equals("noodles")) {
				equalsNoodles = true;
			}
			if (equalsNoodles == false) {
				System.out.println("\t" + foodArray[x]);
				;
			}
		}
		System.out.println();
		System.out.print("All Foods Over 6 Characters:\n");
		for (int x = 0; x < 6; x++) {
			if (foodArray[x].length() > 6) {
				System.out.print("\t" + foodArray[x] + "\n");
			}
		}
		System.out.println();
		System.out.print("Last Characters Only:\n");
		for (int x = 0; x < 6; x++) {
			System.out.print("\t" + foodArray[x].charAt(foodArray[x].length() - 1) + "\n");
		}
		System.out.println();
		System.out.println("Enter a food to search!");
		String search = scanner.nextLine();
		for (int x = 0; x < 6; x++) {
			if (search.equals(foodArray[x])) {
				System.out.print("Index: " + x);
				searchValidity = true;
			}
		}
		if (searchValidity == false) {
			System.out.print("No match");
		}
		System.out.println();
		System.out.print("All Foods in Reverse Order:\n");
		for (int x = 5; x >= 0; x--) {
			System.out.print("\t" + foodArray[x] + "\n");
		}
		System.out.println();
		System.out.print("All Foods Printed Backwards:\n");
		for (int x = 0; x < 6; x++) {
			System.out.print("\t");
			for (int y = foodArray[x].length() - 1; y >= 0; y--) {
				System.out.print(foodArray[x].charAt(y));
			}
			System.out.println();
		}
		scanner.close();
	}
}
