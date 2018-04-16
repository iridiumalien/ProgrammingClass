import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RollEmArray {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner scanner = new Scanner(System.in);
		String name;
		String again = "yes";
		System.out.println("Enter name");
		name = scanner.next();
		System.out.println("Dice Option: Sides?");
		int sides = scanner.nextInt();
		System.out.println("Dice Option: Times? *Between 1 and 20");
		int times = scanner.nextInt();
		int dice[] = new int[times];
		int frequency[] = new int[sides + 1];

		if (times < 1 || times > 20) {
			System.out.println("Invalid");
		} else {
			while (again.equals("yes")) {
				again = "no";
				double sum = 0;
				double average = 0;
				int mode = 0;
				for (int x = 0; x < times; x++) {
					int diceRoll = r.nextInt(sides) + 1;
					dice[x] = diceRoll;
					System.out.println("Roll: " + dice[x]);
					frequency[diceRoll] = frequency[diceRoll] + 1;
					sum = sum + diceRoll;
				}
				for (int x = 1; x < sides + 1; x++) {
					System.out.println("Frequency of " + x + ": " + frequency[x]);
				}
				for (int x = 0; x < sides; x++) {
					if (frequency[x] > mode) {
						mode = x;
					}
				}
				Arrays.sort(dice);
				double median = 0;
				if (dice.length % 2 == 0)
					median = ((double) dice[dice.length / 2] + (double) dice[dice.length / 2 - 1]) / 2;
				else
					median = (double) dice[dice.length / 2];

				average = sum / times;
				System.out.println("Sum: " + sum);
				System.out.println("Average: " + average);
				System.out.println("Mode: " + mode);
				System.out.println("Median: " + median);
				System.out.println("Hey, " + name + ", wanna roll again?");
				again = scanner.next();
			}

		}
		scanner.close();
	}
}
