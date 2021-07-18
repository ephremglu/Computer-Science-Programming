package dungeon;

public class PillarOfOO extends Encounters {

	public void theEncounter(Hero theHero) {
		System.out.println("Hero found a Pillar of OO.");
		theHero.getInventory().setPillarOfOOCount(theHero.getInventory().getPillarOfOOCount() + 1);
	}

	public String encounterName() {
		return "8";
	}
}