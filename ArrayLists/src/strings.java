import java.util.ArrayList;
import java.util.Scanner;

public class strings {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		int smaller = 20;
		int Index = 0;
		String tryAgain = "yes";
		int flag = 0;
		animals.add("Owl");
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Turtle");
		System.out.println("Array V1: " + animals);

		System.out.println("Enter two animals!");
		animals.add(0, scanner.next());
		animals.add(1, scanner.next());
		System.out.println("Array V2: " + animals);

		for (int x = 0; x < animals.size(); x++) {
			if (animals.get(x).length() < smaller) {
				smaller = animals.get(x).length();
				Index = x;
			}
		}
		animals.set(Index, "Skunk");
		System.out.println("Array V3: " + animals);

		while (tryAgain.equals("yes")) {
			tryAgain = "no";
			flag = 0;
			System.out.println("Search for an animal!");
			String search = scanner.next();
			for (int x = 0; x < animals.size(); x++) {
				if (animals.get(x).contains(search)) {
					System.out.println("Index: " + x + "\nName: " + animals.get(x));
					System.out.println("Would you like to remove the item?");
					String remove = scanner.next();
					if (remove.equals("yes")) {
						animals.remove(search);
					}
					flag = 1;
				}
			}
			if (flag == 0) {
				animals.add(search);
				System.out.println("AHHH");
			}
			System.out.println("Array V4: " + animals);
			System.out.println("Search again?");
			tryAgain = scanner.next();
		}

		System.out.print("Array V5: ");
		for (int x = 0; x < animals.size(); x++) {
			System.out.print(animals.get(x).charAt(0) + " ");
		}
		System.out.println();

		System.out.print("Array V6: ");
		for (int x = 0; x < animals.size(); x++) {
			System.out.print(animals.get(x).charAt(animals.get(x).length() - 1) + " ");
		}
		System.out.println();

		System.out.print("Array V7: ");
		for (int i = 0; i < animals.size(); i++) {
			for (int x = 0; x < animals.get(i).length(); x++) {
				if (animals.get(i).charAt(x) == 'a') {
					System.out.print("a");
				}
				if (animals.get(i).charAt(x) == 'e') {
					System.out.print("e");
				}
				if (animals.get(i).charAt(x) == 'i') {
					System.out.print("i");
				}
				if (animals.get(i).charAt(x) == 'o') {
					System.out.print("o");
				}
				if (animals.get(i).charAt(x) == 'u') {
					System.out.print("u");
				}
			}
			System.out.print(" ");
		}

		scanner.close();
	}
}
