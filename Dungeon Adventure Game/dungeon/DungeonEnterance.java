package dungeon;

public class DungeonEnterance extends Encounters {

	@Override
	public void theEncounter(Hero theHero) {
		System.out.println("Hero is at the dungeon enterance.");

	}

	@Override
	public String encounterName() {
		return "I";
	}

}