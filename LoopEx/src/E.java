import java.util.Scanner;

public class E {
	public static void main(String[] args) {

		System.out.println("Please type a character");
		System.out.println("Please type a number");

		Scanner scanner = new Scanner(System.in);

		String a = scanner.next();
		int b = scanner.nextInt();

		int i = 1;
		while (i < b) {
			System.out.print(a);
			i++;
		}
		int c = 0;
		while (c < b) {
			System.out.println(a);
			c++;
		}
		scanner.close();
	}
}
