package car;

import java.util.Scanner;

public class CarTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Car Ford = new Car("Mustang", 23, 14.5);
		Car Honda = new Car("Accord", 29, 15.8);
		
		System.out.println("Trip in " + Ford.getType() + " with " + Ford.getMPG() + " miles per gallon and a " + Ford.getSize() + " size tank!");
		System.out.println("\tHow long is your trip (miles)?");
		int lengthTrip = in.nextInt();
		System.out.print("\tYou will need ");
		System.out.print(Math.ceil(Ford.fullTanks(lengthTrip)));
		System.out.println(" full tanks!");
		System.out.print("\tYou will need ");
		System.out.print(Math.ceil(Ford.gallons(lengthTrip)));
		System.out.println(" gallons!");
		System.out.println("\tHow much does gas cost per gallon?");
		double cost = in.nextDouble();
		System.out.print("\tIt will cost ");
		System.out.printf("%1$.2f", Ford.gasCost(cost));
		System.out.println(" to fill up your car!");
		System.out.println();
		
		System.out.println("Trip in " + Honda.getType() + " with " + Honda.getMPG() + " miles per gallon and a " + Honda.getSize() + " size tank!");
		System.out.println("How long is your trip (miles)?");
		lengthTrip = in.nextInt();
		System.out.print("\tYou will need ");
		System.out.print(Math.ceil(Honda.fullTanks(lengthTrip)));
		System.out.println(" full tanks!");
		System.out.print("\tYou will need ");
		System.out.print(Math.ceil(Honda.gallons(lengthTrip)));
		System.out.println(" gallons!");
		System.out.println("\tHow much does gas cost per gallon?");
		cost = in.nextDouble();
		System.out.print("\tIt will cost ");
		System.out.printf("%1$.2f", Honda.gasCost(cost));
		System.out.println(" to fill up your car!");
		System.out.println();
		
		in.close();
	}
}
