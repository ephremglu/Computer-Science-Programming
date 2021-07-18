package dungeon;

public class MonsterEncounter extends Encounters {

	@Override
	public void theEncounter(Hero theHero) {
		System.out.println("The hero has encountered a monster!");
	}

	@Override
	public String encounterName() {
		return "X";
	}
}