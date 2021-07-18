package dungeon;

public class Pit extends Encounters {

	@Override
	public void theEncounter(Hero theHero) {
		System.out.println("Hero fell into a pit.");
		int pitDamage = ((int) (1 * Math.random() * 20));
		theHero.reduceHitScore(pitDamage);
		System.out.println("Pit damages hero for " + pitDamage + ".");

	}

	@Override
	public String encounterName() {
		return "P";
	}
}