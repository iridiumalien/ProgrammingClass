package sample;

public class Cheese {

	private double weight;

	public Cheese() {
		weight = 3.0;
	}

	public Cheese(double weightAmount) {
		weight = weightAmount;
	}

	public double getWeight() {
		return weight;
	}

	public void eatCheeese(int bites) {
		weight = weight - .1 * bites;
	}

}
