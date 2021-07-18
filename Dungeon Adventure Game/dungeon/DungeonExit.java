package dungeon;

public class DungeonExit extends Encounters {

	public void theEncounter(Hero theHero) {
		if (theHero.getInventory().getPillarOfOOCount() < 4) {
			System.out.println("The hero must collect all the Pillars before leaving the dungeon.");
		} else {
			System.out.println("The hero exits the dungeon.");
		}
	}

	public String encounterName() {
		return "O";
	}

}
