package sheet1;

import java.util.Scanner;

public class Area {
	public static void main(String[] args) {

		int radius;
		int height;
		int choice;
		int volume;
		int volumeTwo;
		char again = 'y';
		Scanner scanner = new Scanner(System.in);

		while (again == 'y') {
			System.out.println("What shape would you like to calculate the volume of? "
					+ "Enter '1' for a cylinder, '2' for a cone, and '3' for a sphere!"
					+ "Enter '4' for a silo, and '5' for an ice cream cone!");
			choice = scanner.nextInt();

			System.out.println("What is the radius?");
			radius = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("What is the height?");
				height = scanner.nextInt();
				volume = ((int) (Math.pow(radius, 2))) * height;
				System.out.print(volume * Math.PI);
				System.out.println(" or " + volume + "pi");
				break;
			case 2:
				System.out.println("What is the height?");
				height = scanner.nextInt();
				volume = (((int) (Math.pow(radius, 2))) * height) / 3;
				System.out.print(volume * Math.PI);
				System.out.println(" or " + volume + "pi");
				break;
			case 3:
				volume = ((int) (Math.pow(radius, 3))) * 4 / 3;
				System.out.print(volume * Math.PI);
				System.out.println(" or " + volume + "pi");
				break;
			case 4:
				System.out.println("What is the height?");
				height = scanner.nextInt();
				volume = ((int) (Math.pow(radius, 2))) * height;
				volumeTwo = ((int) (Math.pow(radius, 3))) * 4 / 6;
				System.out.print((volume * Math.PI) + (volumeTwo * Math.PI));
				break;
			case 5:
				System.out.println("What is the height?");
				height = scanner.nextInt();
				volume = (((int) (Math.pow(radius, 2))) * height) / 3;
				volumeTwo = ((int) (Math.pow(radius, 3))) * 4 / 6;
				System.out.print(volume * Math.PI + volumeTwo * Math.PI);
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			System.out.println("Enter 'y' to calculate another object's volume!");
			again = scanner.next().charAt(0);
		}
		scanner.close();
	}

}
