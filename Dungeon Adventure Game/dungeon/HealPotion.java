package dungeon;

public class HealPotion extends Encounters {

	public void theEncounter(Hero theHero) {
		System.out.println("Hero found a healing potion.");
		theHero.getInventory().setHealingPotionCount(theHero.getInventory().getHealingPotionCount() + 1);
	}

	public String encounterName() {
		return "H";
	}

	public void useHealingPotion(Hero theHero) {
		if (theHero.getInventory().getHealingPotionCount() < 1) {
			System.out.println("No healing potions left.");
		} else {
			int healPotValue = ((int) (5 + Math.random() * 15));
			theHero.addHitScore(healPotValue);
			theHero.getInventory().setHealingPotionCount(theHero.getInventory().getHealingPotionCount() - 1);
			System.out.println("The Hero healed for: " + healPotValue);
			System.out.println("The Hero's HP is now: " + theHero.getHitScore());
		}
	}
}