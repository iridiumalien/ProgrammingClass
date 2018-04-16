package galaxies;

import java.util.Random;

public class Galaxy {
	String name;
	int mass;
	double velocity;
	Random r = new Random();

	public Galaxy() // default constructor
	{
		name = "Earth";
		mass = 256;
		velocity = 15000;
	}

	public Galaxy(String n, int m, double v) // assignment constructor
	{
		name = n;
		mass = m;
		velocity = v;
	}

	public String getName() {
		return name;
	}

	public int getMass() {
		return mass;
	}

	public double getVelocity() {
		return velocity;
	}

	public void solarFlare() {

		boolean sign = r.nextBoolean();
		if (sign == true) {
			velocity = velocity + r.nextInt(2000);
		} else {
			velocity = velocity - r.nextInt(2000);
		}
	}

	public void klingonRay() {
		mass = mass - r.nextInt(120);
	}

	public void collide(Galaxy object) {
		this.velocity = this.velocity - r.nextInt(20000);
		object.velocity = object.velocity - r.nextInt(10000);

	}

	public String toString() {
		return "Object " + name + ": " + mass + " kg and " + velocity + " m/s";
	}
}
