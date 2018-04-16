import java.util.Scanner;

public class NewThree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double test = 0;
		int x = 1;
		String name;

		System.out.println("What is your name?");
		name = scanner.next();
		while (!name.equals("done")) {
			System.out.println("Please enter your test scores! :D");
			test = scanner.nextDouble();
			Double sum = test;
			Double average = null;

			while (test != -1) {
				System.out.println("Test: " + test);
				test = scanner.nextDouble();
				sum = sum + test;
				x++;
				if (test != -1) {
					average = sum / x;
				}
			}

			if (test == -1) {
				System.out.println();
				System.out.println(name + ", your average is " + average + "!!");
			}

			if (average >= 90 && average <= 100) {
				System.out.println("Congrats on that A!! :D");
			} else if (average >= 80 && average < 90)
				System.out.println("You got a B, eh? Not too shabby! ;)");
			else if (average >= 70 && average < 80)
				System.out.println("That's a C, bro... :/");
			else if (average >= 60 && average < 70)
				System.out.println("You got a D! :0");
			else
				System.out.println("That's an F, buddy. Yikes!! D:");

			System.out.println();
			System.out.println("What is your name?");
			name = scanner.next();
		}
		System.out.println("Goodbye!");

		scanner.close();
	}
}
