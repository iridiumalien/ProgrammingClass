import java.util.Scanner;

public class Three {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = null;
		double testOne = 0;
		double testTwo = 0;
		double testThree = 0;
		
		do {
			System.out.println("What is your name?");
			name = scanner.next();

			System.out.println("Please enter your last three test scores! :D");
			testOne = scanner.nextDouble();
			testTwo = scanner.nextDouble();
			testThree = scanner.nextDouble();
			double average = (testOne + testTwo + testThree) / 3;
			
			System.out.println(name);
			System.out.println("Test one: " + testOne);
			System.out.println("Test two: " + testTwo);
			System.out.println("Test three: " + testThree);
			System.out.println("Your average is " + average);

			if (average >= 90 && average <= 100)
				System.out.println("Congrats on that A!! :D");
			if (average >= 80 && average < 90)
				System.out.println("You got a B, eh? Not too shabby! ;)");
			if (average >= 70 && average < 80)
				System.out.println("That's a C, bro... :/");
			if (average >= 60 && average < 70)
				System.out.println("You got a D! :0");
			if (average >= 0 && average < 60)
				System.out.println("That's an F, buddy. Yikes!! D:");
			
			System.out.println();
		} while (name != "done");
		scanner.close();
	}
}
