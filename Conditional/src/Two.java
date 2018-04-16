import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter three numbers! :D");
		int one = scanner.nextInt();
		int two = scanner.nextInt();
		int three = scanner.nextInt();
		int highest = 0;
		int middle = 0;
		int lowest = 0;
		int x = 0;
		// highest
		if (one > two && one > three) {
			highest = one;
		}
		if (two > three && two > one) {
			highest = two;
		}
		if (three > two && three > one) {
			highest = three;
		}

		// middle
		if ((one > two && one < three) || (one < two && one > three)) {
			middle = one;
		}
		if ((two > three && two < one) || (two < three && two > one)) {
			middle = two;
		}
		if ((three > two && three < one) || (three < two && three > one)) {
			middle = three;
		}

		// lowest
		if (one < two && one < three) {
			lowest = one;
		}
		if (two < three && two < one) {
			lowest = two;
		}
		if (three < two && three < one) {
			lowest = three;
		}

		// printing

		do {

			if (x == 0) {
				System.out.println("the highest is " + highest);
			}
			if (x == 1) {
				System.out.println("the middle is " + middle);
			}
			if (x == 2) {
				System.out.println("the lowest is " + lowest);
			}
			x++;
		} while (x <= 2);

		scanner.close();
	}
}
