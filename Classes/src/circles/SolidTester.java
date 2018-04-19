package circles;

import java.util.Scanner;

public class SolidTester {
	public static void main(String[] args) {
		double volume;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Radius of Cylinder: ");
		int radius = scanner.nextInt();
		System.out.println("Height of Cylinder: ");
		int height = scanner.nextInt();
		Circles Cyl = new Circles(radius, "Cylinder");
		volume = Cyl.Area() * height;
		System.out.println("Volume: " + volume);
		System.out.println("Surface Area: " + Cyl.CylinderSA(height));
		
		System.out.println();
		
		System.out.println("Radius of Cone: ");
		radius = scanner.nextInt();
		System.out.println("Height of Cone: ");
		height = scanner.nextInt();
		Circles Cone = new Circles(radius, "Cone");
		volume = (Cone.Area() * height) / 3;
		System.out.println("Volume: " + volume);
		System.out.println("Surface Area: " + Cone.ConeSA(height));
		
		System.out.println();
		
		System.out.println("Radius of Sphere: ");
		radius = scanner.nextInt();
		Circles Sphere = new Circles(radius, "Sphere");
		volume = Sphere.SphereVolume();
		System.out.println("Volume: " + volume);
		System.out.println("Surface Area: " + Sphere.SphereSA());
		
		System.out.println();
		
		
		scanner.close();
	}
}
