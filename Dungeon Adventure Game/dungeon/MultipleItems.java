package dungeon;

public class MultipleItems extends Encounters {

	@Override
	public void theEncounter(Hero theHero) {
		System.out.println("The Hero has found a Heal Potion and a Vision Potion.");
		theHero.getInventory().setHealingPotionCount(theHero.getInventory().getHealingPotionCount() + 1);
		theHero.getInventory().setVisionPotionCount(theHero.getInventory().getVisionPotionCount() + 1);
		System.out.println("Hero fell into a pit.");
		int pitDamage = ((int) (1 * Math.random() * 20));
		theHero.reduceHitScore(pitDamage);
		System.out.println("Pit damages hero for " + pitDamage + ".");
	}

	@Override
	public String encounterName() {
		return "M";
	}

}