import java.util.Scanner;

public class C {
	public static void main(String[] args) {

		int i;

		System.out.println("enter the number");

		Scanner scanner = new Scanner(System.in);

		int one = scanner.nextInt();
		int two = scanner.nextInt();
		int three = scanner.nextInt();
		int four = scanner.nextInt();
		int five = scanner.nextInt();
		int six = scanner.nextInt();

		for (i = 0; i < one || i < two || i < three || i < four || i < five || i < six; i++) {

		}
		System.out.println("the largest is: " + i);
		scanner.close();
	}
}