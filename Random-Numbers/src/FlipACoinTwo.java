import java.util.Random;
import java.util.Scanner;

public class FlipACoinTwo {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner scanner = new Scanner(System.in);
		char name;
		char guess;
		char coin;
		char againOption = 'N';
		int again = 0;
		System.out.println("Enter name");
		name = scanner.next().charAt(0);

		while (againOption == 'Y' || again < 2) {
			againOption = 'N';
			System.out.println("So.. what's it gonna be? Enter 'H' or 'T'!");
			guess = scanner.next().charAt(0);

			int flip = r.nextInt(2); // random integer 0 or 1
			if (flip == 0)
				coin = 'H';
			else
				coin = 'T';

			System.out.println("It was " + coin);
			System.out.println("You guessed " + guess);

			if (coin == 'H' && guess == 'H') {
				System.out.println("You were right!");
			} else if (coin == 'T' && guess == 'T') {
				System.out.println("You were right!");
			} else {
				System.out.println("You were wrong, buddy. Better luck next time.");
			}

			if (coin == guess) {
				again++;
			}
			if (again == 2) {
				System.out.println("Wanna play again? Enter 'Y' to play again, or 'N' to quit.");
				againOption = scanner.next().charAt(0);
			}
		}
		System.out.println("Goodbye, " + name);
		scanner.close();
	}
}
