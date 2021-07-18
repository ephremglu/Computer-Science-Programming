package dungeon;

import java.util.Scanner;

public class DungeonAdventure {

	public static void main(String[] args) {
		Hero theHero;
		Monster theMonster;
		do {
			theHero = chooseHero();
			theMonster = generateMonster();
			Dungeon theDungeon = new Dungeon(theHero, theMonster);
			theDungeon.navigateDungeon();
			// battle(theHero, theMonster);
		} while (playAgain());
	}

	public static Hero chooseHero() {
		Scanner scanner = new Scanner(System.in);
		int choice = -1;
		Hero theHero;
		System.out.println("Choose a hero:" + "\n1. Warrior" + "\n2. Sorceress" + "\n3. Thief" + "\n4. Archer"
				+ "\n5. Fighter" + "\nEnter your choice: ");
		String inputChoice = scanner.nextLine();
		choice = Integer.parseInt(inputChoice);
		while (choice < 1 || choice > 5) {
			System.out.println("Invalid choice. Enter a valid number.");
			choice = Integer.parseInt(inputChoice);
		}
		return HeroFactory.addCharacter(choice);
	}

	public static Monster generateMonster() {
		int choice;
		choice = (int) (Math.random() * 5) + 1;
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
}