import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("\n");
		String name;
		System.out.println("Enter name");
		name = scanner.next();

		int diceOne = 1;
		int diceTwo = 2;
		int diceThree = 3;
		int x = 0;
		char reRollOne;
		char reRollTwo;
		char reRollThree;

		diceOne = r.nextInt(6) + 1;
		diceTwo = r.nextInt(6) + 1;
		diceThree = r.nextInt(6) + 1;
		System.out.println("Dice One=" + " " + diceOne);
		System.out.println("Dice Two=" + " " + diceTwo);
		System.out.println("Dice Three=" + " " + diceThree);

		while ((diceOne != diceTwo) || (diceOne != diceThree)) {
			x++;
			if (diceOne != diceTwo || diceOne != diceThree) {
				System.out.println("To reroll Dice One, enter 'Y'!");
				reRollOne = scanner.next().charAt(0);
				if (reRollOne == 'Y') {
					diceOne = r.nextInt(6) + 1;
				}
				System.out.println("To reroll Dice Two, enter 'Y'!");
				reRollTwo = scanner.next().charAt(0);
				if (reRollTwo == 'Y') {
					diceTwo = r.nextInt(6) + 1;
				}
				System.out.println("To reroll Dice Three, enter 'Y'!");
				reRollThree = scanner.next().charAt(0);
				if (reRollThree == 'Y') {
					diceThree = r.nextInt(6) + 1;
				}

				System.out.println("Dice One=" + " " + diceOne);
				System.out.println("Dice Two=" + " " + diceTwo);
				System.out.println("Dice Three=" + " " + diceThree);
			}
		}
		System.out.print("You win!! :D Good job, " + name + "\n");
		if (x == 1) {
			System.out.println("ACHIEVEMENT UNLOCKED: 'Lucky'!");
		} else if (x == 2) {
			System.out.println("ACHIEVEMENT UNLOCKED: 'Rookie'!");
		} else if (x > 2 && x < 7) {
			System.out.println("ACHIEVEMENT UNLOCKED: 'Just Another Average Man'!");
		} else if (x >= 7 && x < 13) {
			System.out.println("ACHIEVEMENT UNLOCKED: 'Gamblin Man'!");
		} else {
			System.out.println("NO ACHIEVEMENTS UNLOCKED!");
		}
		scanner.close();
	}
}