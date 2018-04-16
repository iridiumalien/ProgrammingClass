import java.util.Scanner;

public class SampleArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[][] LotteryNos = new int[3][4]; // create array; 3 rows, 4 columns

		LotteryNos[1][2] = 75; // assign value to location row 1, column 2
		LotteryNos[2][0] = LotteryNos[1][2] + 5;

		for (int x = 0; x <= 3; x++)
			LotteryNos[0][x] = 99; // assign '99' to every value in row 0

		for (int r = 0; r <= 2; r++) // print out the 2D array
		{
			for (int c = 0; c <= 3; c++) {
				if (LotteryNos[r][c] < 10)
					System.out.print(" " + LotteryNos[r][c] + " ");
				else
					System.out.print(LotteryNos[r][c] + " ");
			}
			System.out.println();
		}
		in.close();
	}
}

//Create a square matrix  (ie. 4 x 4 or 5 x 5) loaded with 0's
//Randomly place some non-zero value at an [i][j] location
//Prompt user to guess location
//  if incorrect, place a '1' at that location, and print matrix
//  if correct, let user know!
//
//Create some type of scoring game

//Extensions:  A)  Give user 'clues' if row correct or column correct
//           	   B)  Make game more like Battleship 
//              	           (2 or 3 cells together need to be identified)
//

