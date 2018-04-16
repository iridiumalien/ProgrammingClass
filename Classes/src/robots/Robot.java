package robots;

import java.util.Random;
import java.util.Scanner;

public class Robot {
	public String driveTrain;
	public String gameMech;
	public int wheelAmount;
	public String cubePickUp;
	public String pointScoring;
	public String auto;
	public String endGame;
	Random r = new Random();
	private int counter = 0;
	Scanner in = new Scanner(System.in);
	int win = r.nextInt(10);

	public Robot() {
		driveTrain = "Tank";
		gameMech = "None";
		wheelAmount = 4;
		cubePickUp = "Ground";
		pointScoring = "Exchange";
		auto = "Baseline";
		endGame = "Park";
	}

	public Robot(String drive, String mech, int wheels, String cubes, String points, String autonomous, String end) {
		driveTrain = drive;
		gameMech = mech;
		wheelAmount = wheels;
		cubePickUp = cubes;
		pointScoring = points;
		auto = autonomous;
		endGame = end;
	}

	public String getName() {
		System.out.println("Finally, what is your robot's name?");
		String name = in.next();
		return name;
	}

	public String getDriveTrain() {
		return driveTrain;
	}

	public String getGameMech() {
		return gameMech;
	}

	public int getWheelAmount() {
		return wheelAmount;
	}

	public String getCubes() {
		return cubePickUp;
	}

	public String getPoints() {
		return pointScoring;
	}

	public String getAuto() {
		return auto;
	}

	public String getEndGame() {
		return endGame;
	}

	public boolean GMSuccess(int accuracy) {
		boolean success = true;
		int fate = r.nextInt(9) + 1;
		if ((accuracy < 75) || (fate < 2)) {
			success = r.nextBoolean();
			if (success == false) {
				counter++;
			}
		}
		return success;
	}

	public boolean PointsSuccess(int accuracy) {
		boolean success = true;
		int fate = r.nextInt(9) + 1;
		if ((accuracy < 75) || (fate < 2)) {
			success = r.nextBoolean();
			if (success == false) {
				counter++;
			}
		}
		return success;
	}

	public boolean AutoSuccess(int accuracy) {
		boolean success = true;
		int fate = r.nextInt(9) + 1;
		if ((accuracy < 75) || (fate < 2)) {
			success = r.nextBoolean();
			if (success == false) {
				counter++;
			}
		}
		return success;
	}

	public boolean EGSuccess(int accuracy) {
		boolean success = true;
		int fate = r.nextInt(9) + 1;
		if ((accuracy < 75) || (fate < 2)) {
			success = r.nextBoolean();
			if (success == false) {
				counter++;
			}
		}
		return success;
	}

	public int getFailure() {
		return counter;
	}

	public String Choice(String Final) {
		Final = "Goodbye!";
		switch (counter) {
		case 0:
			System.out.println("AMAZING!! You are our #1 pick!");
		case 1:
			break;
		case 2:
			System.out.println("Pretty good, bro! You're definitely on our list!");
		case 3:
			break;
		case 4:
			System.out.println("I can neither confirm nor deny.");
		case 5:
			break;
		default:
			System.out.println("OOF! Um.. Sorry bud...");
			break;
		}
		return Final;

	}

}