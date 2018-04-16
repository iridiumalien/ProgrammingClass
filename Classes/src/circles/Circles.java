package circles;

public class Circles {
	public static final double PI = 3.14159;
	private int radius;
	private String name;

	public Circles() {
		radius = 1;
		name = "Default";
	}

	public Circles(int rad, String n) {
		radius = rad;
		name = n;
	}

	public int getRadius() {
		return radius;
	}
	
	public String getName() {
		return name;
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
	
	public void add(Circles A) {
		this.radius = (this.radius + A.radius) - 1;
		A.radius = A.radius - 1;
	}
	
	public String toString() {
		return "| " + name + ", " + this.radius + " |";
	}
	
}
