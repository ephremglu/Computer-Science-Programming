import java.util.Scanner;

public class Dungeon {

	public static void main(String[] args) {
		Hero theHero;
		Monster theMonster;
		do {
			theHero = chooseHero();
			theMonster = generateMonster();
			battle(theHero, theMonster);
		} while (playAgain());
	}

	public static Hero chooseHero() {
		Scanner scanner = new Scanner(System.in);
		int choice = -1;
		Hero theHero;
		System.out.println("Choose a hero:\n" + "1. Warrior\n" + "2. Sorceress\n" + "3. Thief" + "\nEnter your choice: ");
		String inputChoice = scanner.nextLine();
		choice = Integer.parseInt(inputChoice);
		while (choice < 1 || choice > 3) {
			System.out.println("Invalid choice. Enter a valid number.");
			choice = Integer.parseInt(inputChoice);
		}
		return HeroFactory.addCharacter(choice);
	}

	public static Monster generateMonster() {
		int choice;
		choice = (int) (Math.random() * 3) + 1;
		return MonsterFactory.addCharacter(choice);
	}

	public static boolean playAgain() {
		Scanner scanner = new Scanner(System.in);
		char again;
		System.out.println("Play again (y/n)?: ");
		String inputChoice = scanner.nextLine();
		again = inputChoice.charAt(0);
		return (again == 'Y' || again == 'y');
	}

	public static void battle(Hero theHero, Monster theMonster) {
		Scanner scanner = new Scanner(System.in);
		char pause = 'p';
		System.out.println(theHero.getName() + " battles " + theMonster.getName());
		System.out.println("\n");
		while (theHero.alive() && theMonster.alive() && pause != 'q') {
			theHero.takeAction(theMonster);
			if (theMonster.alive())
				theMonster.strike(theHero);
			System.out.print("\nEnter q to quit, anything else to continue: ");
			String inputChoice = scanner.nextLine();
			pause = inputChoice.charAt(0);
		}
		if (!theMonster.alive())
			System.out.println(theHero.getName() + " was victorious!");
		else if (!theHero.alive())
			System.out.println(theHero.getName() + " was defeated :-(");
		else
			System.out.println("Quitters never win ;-)");
	}
}