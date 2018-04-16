import java.util.Scanner;

public class ConditionalOne {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a name and grade! :D");
		String name1 = scanner.next();
		int grade1 = scanner.nextInt();

		System.out.println("Please enter another name and grade! :D");
		String name2 = scanner.next();
		int grade2 = scanner.nextInt();

		if (grade1 > grade2) {
			System.out.print("Highest: " + name1 + " " + grade1);
			System.out.println();
			System.out.print("Lowest: " + name2 + " " + grade2);
			System.out.println();
		} else {
			System.out.print("Highest: " + name2 + " " + grade2);
			System.out.println();
			System.out.print("Lowest: " + name1 + " " + grade1);
			System.out.println();
		}
		scanner.close();
	}
}
