package circles;

import java.util.Scanner;

public class PizzaTester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the diameter of your pizza.");
		int diameter = scanner.nextInt();
		System.out.println("Please enter the number of slices in your pizza.");
		int slices = scanner.nextInt();
		System.out.println("Please enter the price of your pizza.");
		double price = scanner.nextDouble();
		
		Circles A = new Circles(diameter/2, "A");
		
		System.out.println(A);
		System.out.print("Area: ");
		System.out.printf("%1$.2f", A.Area());
		System.out.print("\nPrice/Inch: $");
		System.out.printf("%1$.2f", (price/A.Area()));
		System.out.print("\nBites: ");
		System.out.printf("%1$.2f", (A.Area()/2.5));
		System.out.print(" in\nArea of a Slice: ");
		System.out.printf("%1$.2f", (A.Area()/slices));
		System.out.print(" in\nCrust Length per Slice: ");
		System.out.printf("%1$.2f", (A.Circumf()/slices));
		System.out.print(" in\n");
		
		System.out.println("Please enter the diameter of your pizza.");
		diameter = scanner.nextInt();
		System.out.println("Please enter the number of slices in your pizza.");
		slices = scanner.nextInt();
		System.out.println("Please enter the price of your pizza.");
		price = scanner.nextDouble();
		
		Circles B = new Circles(diameter/2, "B");
		
		System.out.println(B);
		System.out.print("Area: ");
		System.out.printf("%1$.2f", B.Area());
		System.out.print("\nPrice/Inch: $");
		System.out.printf("%1$.2f", (price/B.Area()));
		System.out.print("\nBites: ");
		System.out.printf("%1$.2f", (B.Area()/2.5));
		System.out.print(" in\nArea of a Slice: ");
		System.out.printf("%1$.2f", (B.Area()/slices));
		System.out.print(" in\nCrust Length per Slice: ");
		System.out.printf("%1$.2f", (B.Circumf()/slices));
		System.out.print(" in\n");
		
		A.add(B);
		System.out.println(A);
		System.out.println(B);
		
		scanner.close();
	}
}
