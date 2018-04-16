package robots;

import java.util.Scanner;

public class RobotsTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// in.useDelimiter("\n");

		Robot Dozer = new Robot();
		Robot Lanceabot = new Robot("Tank", "Intake", 4, "Ground", "Switch", "Baseline", "Park");
		Robot Atlas = new Robot("West Coast Tank", "Intake and Ramp", 6, "Ground", "Switch / Exchange", "Baseline",
				"Ramps");

		System.out.println("Dozer: ");
		System.out.println("\tDrive Train: " + Dozer.getDriveTrain());
		System.out.println("\tGame Mech: " + Dozer.getGameMech());
		System.out.println("\tWheels: " + Dozer.getWheelAmount());
		System.out.println("\tCube Pickup Location: " + Dozer.getCubes());
		System.out.println("\tPoint Scoring Method(s): " + Dozer.getPoints());
		System.out.println("\tAutonomous: " + Dozer.getAuto());
		System.out.println("\tEndgame: " + Dozer.getEndGame());
		System.out.println();

		System.out.println("Lanceabot: ");
		System.out.println("\tDrive Train: " + Lanceabot.getDriveTrain());
		System.out.println("\tGame Mech: " + Lanceabot.getGameMech());
		System.out.println("\tWheels: " + Lanceabot.getWheelAmount());
		System.out.println("\tCube Pickup Location: " + Lanceabot.getCubes());
		System.out.println("\tPoint Scoring Method(s): " + Lanceabot.getPoints());
		System.out.println("\tAutonomous: " + Lanceabot.getAuto());
		System.out.println("\tEndgame: " + Lanceabot.getEndGame());
		System.out.println();

		System.out.println("Atlas: ");
		System.out.println("\tDrive Train: " + Atlas.getDriveTrain());
		System.out.println("\tGame Mech: " + Atlas.getGameMech());
		System.out.println("\tWheels: " + Atlas.getWheelAmount());
		System.out.println("\tCube Pickup Location: " + Atlas.getCubes());
		System.out.println("\tPoint Scoring Method(s): " + Atlas.getPoints());
		System.out.println("\tAutonomous: " + Atlas.getAuto());
		System.out.println("\tEndgame: " + Atlas.getEndGame());
		System.out.println();

		System.out.println("What is your robot's drive train?");
		String driveTrain = in.nextLine();
		System.out.println("What is your robot's game mech?");
		String gameMech = in.nextLine();
		System.out.println("How many wheels does your robot have?");
		int wheels = in.nextInt();
		System.out.println("Where does your robot get cubes from?");
		String cubes = in.next();
		String MEH = in.nextLine();
		System.out.println("Where does your robot score points?");
		String points = in.nextLine();
		System.out.println("What is your robot's autonomous?");
		String auto = in.nextLine();
		System.out.println("What is your robot's endgame?");
		String endgame = in.nextLine();

		Robot User = new Robot(driveTrain, gameMech, wheels, cubes, points, auto, endgame);

		System.out.println("Here is " + User.getName() + ": ");
		System.out.println("\tDrive Train: " + User.getDriveTrain());
		System.out.println("\tGame Mech: " + User.getGameMech());
		System.out.println("\tWheels: " + User.getWheelAmount());
		System.out.println("\tCube Pickup Location: " + User.getCubes());
		System.out.println("\tPoint Scoring Method(s): " + User.getPoints());
		System.out.println("\tAutonomous: " + User.getAuto());
		System.out.println("\tEndgame: " + User.getEndGame());
		System.out.println();

		System.out.println("We are considering picking you for an alliance!!");
		System.out.println("How accurate is your Game Mech?");
		int GM = in.nextInt();
		System.out.println("How accurate is your Point Scoring Method?");
		int PSM = in.nextInt();
		System.out.println("How accurate is your Autonomous?");
		int AU = in.nextInt();
		System.out.println("How accurate is your End Game Mech?");
		int EG = in.nextInt();

		System.out.println("Okay, Let's watch some matches!");
		System.out.println("Match 1: ");
		System.out.println(User.GMSuccess(GM));
		System.out.println(User.PointsSuccess(PSM));
		System.out.println(User.AutoSuccess(AU));
		System.out.println(User.EGSuccess(EG));
		
		if (User.getFailure() < 5) {
			System.out.println("You beat Dozer!");
		} else {
			System.out.println("You lost to Dozer!");
		}
		
		System.out.println();

		System.out.println("Match 2: ");
		System.out.println(User.GMSuccess(GM));
		System.out.println(User.PointsSuccess(PSM));
		System.out.println(User.AutoSuccess(AU));
		System.out.println(User.EGSuccess(EG));

		if (User.getFailure() < 3) {
			System.out.println("You beat Lanceabot!");
		} else {
			System.out.println("You lost to Lanceabot!");
		}
		
		System.out.println();
		
		System.out.println("Match 3: ");
		System.out.println(User.GMSuccess(GM));
		System.out.println(User.PointsSuccess(PSM));
		System.out.println(User.AutoSuccess(AU));
		System.out.println(User.EGSuccess(EG));
		
		if (User.getFailure() < 1) {
			System.out.println("You beat Atlas!");
		} else {
			System.out.println("You lost to Atlas!");
		}
		
		System.out.println();

		System.out.println("You failed " + User.getFailure() + " times...");
		System.out.println(User.Choice(" "));
		System.out.println(MEH);
		in.close();
	}
}
