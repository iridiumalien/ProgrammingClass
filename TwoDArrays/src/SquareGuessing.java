import java.util.Random;
import java.util.Scanner;

public class SquareGuessing {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		int counter = 0;
		int score = 500;
		String again = "yes";
		boolean miss = false;
		int xPoint = 0;
		int yPoint = 0;
		int side = r.nextInt(3);
		System.out.println("Enter name");
		String name = in.next();
		
		System.out.println("What size board would you like?");
		int size = in.nextInt();
		char[][] Board = new char[size][size];
		
		int i = r.nextInt(8) + 1;
		int j = r.nextInt(8) + 1;
		
		if (side == 0) {
			xPoint = i + 1;
			yPoint = j;
		} else if (side == 1) {
			xPoint = i - 1;
			yPoint = j;
		} else if (side == 2) {
			xPoint = i;
			yPoint = j + 1;
		} else {
			xPoint = i;
			yPoint = j - 1;
		}

		for (int y = 0; y < size; y++) {
			for (int x = 0; x < size; x++) {
				Board[x][y] = '0';
			}
		}
		System.out.println("Hello, " + name + "!");
		System.out.print("Guess a coordinate!\n");
		while (again.equals("yes") && (miss == false)) {
			again = "no";
			System.out.print("x = ");
			int xGuess = in.nextInt() - 1;
			System.out.print("y = ");
			int yGuess = in.nextInt() - 1;
			if (((xGuess == i) && (yGuess == j)) || ((xGuess == xPoint) && (yGuess == yPoint))) {
				System.out.println("Hit");
				miss = false;
				counter = counter + 1;
			} else {
				System.out.println("Miss");
				miss = true;

			}
			if ((miss == true)) {
				Board[xGuess][yGuess] = 'x';
			} else if (miss == false) {
				Board[xGuess][yGuess] = '*';
			}

			for (int y = 0; y < size; y++) {
				for (int x = 0; x < size; x++) {
					System.out.print(Board[x][y] + " ");
				}
				System.out.println();
			}
			if (miss == true) {
				miss = false;
				System.out.println("Would you like a clue?\n\tIt will cost you 20 points!\n\tEnter 'yes' for a clue!");
				String clue = in.next();
				if (clue.equals("yes")) {
					score = score - 20;
					if (counter == 0) {
						if (xGuess == i) {
							System.out.println("Correct Column!");
						} else if (yGuess == j) {
							System.out.println("Correct Row!");
						} else {
							System.out.println("Sorry, bud, you're not even close!");
						}

					} else {
						if (xGuess == xPoint) {
							System.out.println("Correct Column!");
						} else if (yGuess == yPoint) {
							System.out.println("Correct Row!");
						} else {
							System.out.println("Sorry, bud, you're not even close!");
						}
					}
				}
			}
			System.out.println();

			if (counter > 1) {
				System.out.println("Sunk!");
			}

			if (counter < 2) {
				score = score - 15;
				System.out.println("Play again?");
				again = in.next();
			}
			System.out.println();

			if (counter == 2) {
				System.out.println("Your score is: " + score);
			}
		}
		in.close();
	}
}
