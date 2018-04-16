import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class integers {
	public static void main(String[] args) {
		ArrayList<Integer> numberz = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();

		numberz.add(47);
		numberz.add(86);
		numberz.add(23);
		numberz.add(34);
		System.out.println("Array V1: " + numberz);

		numberz.set(3, 99);
		System.out.println("Array V2: " + numberz);
		
		numberz.set(1, 100);
		System.out.println("Array V3: " + numberz);

		System.out.println("Please enter a number from 3 to 5!");
		int newRandomIntegers = scanner.nextInt();
		for (int x = 0; x < newRandomIntegers; x++) {
			int random = r.nextInt(80) + 20;
			numberz.add(random);
		}
		System.out.println("Array V4: " + numberz);

		for (int x = 0; x < numberz.size(); x++) {
			if (numberz.get(x) % 2 == 0) {
				numberz.remove(x);
				x--;
			}
		}
		System.out.println("Array V5: " + numberz);
		int lastnumber = numberz.get(numberz.size() - 1);
		int firstnumber = numberz.get(0);
		numberz.set(0, lastnumber);
		numberz.set(numberz.size() - 1, firstnumber);
		System.out.println("Array V6: " + numberz);

		scanner.close();
	}
}
