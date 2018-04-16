import java.util.Scanner;

//PROMPT THE USER TO ENTER NUMBERS UNTIL -99 IS ENTERED, THEN PRINT THE SUM AND AVERAGE
public class D {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Type a number");
		double input = scanner.nextDouble();

		double sum = input;
		double c = 1.0;
		double avg = 0;
		while (input != -99) {

			input = scanner.nextDouble();
			c++;
			sum = sum + input;
			avg = sum / c;
		}
		System.out.println(sum);
		System.out.println(avg);
		scanner.close();
	}
}
