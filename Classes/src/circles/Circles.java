package circles;

public class Circles {
	public static final double PI = 3.14159;
	private int radius;

	public Circles() {
		radius = 1;
	}

	public Circles(int rad) {
		radius = rad;
	}

	public int getRadius() {
		return radius;
	}

	public double Area() {
		return Math.pow(radius, 2) * PI;
	}

	public double Circumf() {
		return 2 * PI * radius;
	}
	
	public double arcLength(double degrees) {
		double arcLength = (degrees / 360) * Circumf();
		return arcLength;
	}
	public double sectorArea(double degrees) {
		double sectorArea = (degrees / 360) * Area();
		return sectorArea;
	}
	public double rotations(double feet) {
		double rotationAmount = feet/Circumf();
		return rotationAmount;
	}

}
