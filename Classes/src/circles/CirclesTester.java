package circles;

public class CirclesTester {
	public static void main(String[] args) {

		Circles circle1 = new Circles();
		Circles circle2 = new Circles(2);

		System.out.println("Format...");
		System.out.println("Name: radius, area, circumference,");
		System.out.println("\tarc length, sector area, rotations.");
		System.out.println();
		
		// Circle 1
		System.out.print("Circle 1: " + circle1.getRadius());
		System.out.print(", ");
		System.out.printf("%1$.2f", circle1.Area());
		System.out.print(", ");
		System.out.printf("%1$.2f", circle1.Circumf());
		System.out.println(", ");

		System.out.print("\t");
		System.out.printf("%1$.2f", circle1.arcLength(60));
		System.out.print(", ");
		System.out.printf("%1$.2f", circle1.sectorArea(60));
		System.out.print(", ");
		System.out.printf("%1$.2f", circle1.rotations(5280));
		System.out.println();
		System.out.println();

		// Circle 2
		System.out.print("Circle 2: " + circle2.getRadius());
		System.out.print(", ");
		System.out.printf("%1$.2f", circle2.Area());
		System.out.print(", ");
		System.out.printf("%1$.2f", circle2.Circumf());
		System.out.println(", ");

		System.out.print("\t");
		System.out.printf("%1$.2f", circle2.arcLength(30));
		System.out.print(", ");
		System.out.printf("%1$.2f", circle2.sectorArea(30));
		System.out.print(", ");
		System.out.printf("%1$.2f", circle2.rotations(5280));
		System.out.println();
		System.out.println();
		
		if (circle1.rotations(5280) > circle2.rotations(5280)) {
			System.out.println("Circle 1 uses more rotations to travel one mile.");
		} else if (circle1.rotations(5280) < circle2.rotations(5280)) {
			System.out.println("Circle 2 uses more rotations to travel one mile.");
		}
		
		if (circle1.arcLength(30) > circle2.arcLength(45)) {
			System.out.println("Circle 1's arc length is larger.");
		} else if (circle1.arcLength(30) < circle2.arcLength(45)) {
			System.out.println("Circle 2's arc length is larger.");
		}
		
		if (circle1.sectorArea(30) > circle2.sectorArea(45)) {
			System.out.println("Circle 1's sector area is larger.");
		} else if (circle1.sectorArea(30) < circle2.sectorArea(45)) {
			System.out.println("Circle 2's sector area is larger.");
		}
		System.out.println();


	}
}
