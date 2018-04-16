package points;

public class PointTester {
	public static void main(String[] args) {

		Point defaultP = new Point();

		Point a1 = new Point(4, 0);
		Point a2 = new Point(4, 2);

		Point b1 = new Point(0, 1);
		Point b2 = new Point(4, 4);

		Point c1 = new Point(-2, 6);
		Point c2 = new Point(2, 2);

		System.out.println(defaultP);
		System.out.println("Quadrant: " + defaultP.quadrant());
		System.out.println();

		System.out.println(a1);
		System.out.println("Quadrant: " + a1.quadrant());
		System.out.println();

		System.out.println(a2);
		System.out.println("Quadrant: " + a2.quadrant());
		System.out.println();

		System.out.print("Midpoint: ");
		System.out.println(a1.midpoint(a2));
		System.out.print("Distance: ");
		System.out.println(a1.distance(a2));
		System.out.print("Equation: ");
		System.out.println(a1.equation(a2));
		System.out.println();

		System.out.print("Midpoint: ");
		System.out.println(b1.midpoint(b2));
		System.out.print("Distance: ");
		System.out.println(b1.distance(b2));
		System.out.print("Equation: ");
		System.out.println(b1.equation(b2));
		System.out.println();

		System.out.print("Midpoint: ");
		System.out.println(c1.midpoint(c2));
		System.out.print("Distance: ");
		System.out.println(c1.distance(c2));
		System.out.print("Equation: ");
		System.out.println(c1.equation(c2));
		System.out.println();

		System.out.print("Vector: ");
		System.out.println(a1.vector(a1));
		System.out.println();

		System.out.print("Vector: ");
		System.out.println(a2.vector(a2));
		System.out.println();

		System.out.print("Vector: ");
		System.out.println(b1.vector(b1));
		System.out.println();

	}
}
