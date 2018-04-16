import java.util.Scanner;

public class RPG {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the wonderful world of Dungeons and Dragons! What is your name?");
		String name = scanner.next();
		System.out.println("Choose your class!");
		String charClass = scanner.next();
		System.out.println("Choose your race!");
		String charRace = scanner.next();
		char validity = 'y';
		while (validity == 'y') {
			if (charClass == "fighter") {
				System.out.println("So you are " + name + " the fighter!");
				validity = 'n';
			} else if (charClass == "wizard") {
				System.out.println("So you are " + name + " the wizard!");
				validity = 'n';
			} else if (charClass == "ranger") {
				System.out.println("So you are " + name + " the ranger!");
			} else {
				System.out.println("Invalid: Choose another class");
				charClass = scanner.next();
			}
		}
	}
}
