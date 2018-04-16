package car;

public class Car {
	String carType;
	int milesPerGallon;
	double gasTankSize;
	double tankNumber = 0;
	double gallons = 0;
	
	public Car() {
		carType = "Rav4";
		milesPerGallon = 20;
		gasTankSize = 10.2;
	}
	public Car(String car, int MPG, double size) {
		carType = car;
		milesPerGallon = MPG;
		gasTankSize = size;
	}

	public String getType() {
		return carType;
	}
	
	public int getMPG() {
		return milesPerGallon;
	}
	
	public double getSize() {
		return gasTankSize;
	}
	
	public double fullTanks(int tripLength) {
		tankNumber = tripLength/milesPerGallon;
		tankNumber = tankNumber/gasTankSize;
		return tankNumber;
	}
	
	public double gasCost(double cost) {
		double  totalCost = gallons * cost;
		return totalCost;
	}
	
	public double gallons(int tripLength) {
		gallons = tripLength/milesPerGallon;
		return gallons;
	}
}
