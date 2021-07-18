public class SorceressAction implements Actions {

	public void setActions(DungeonCharacter enemy, DungeonCharacter hero) {
		int hits;
		int healMin = 25;
		int healMax = 50;
		hits = (int) (Math.random() * (healMax - healMin + 1)) + healMin;
		hero.addHitScore(hits);
		System.out.println(hero.getName() + " added [" + hits + "] points.\n" + "Total hit points remaining are: "
				+ hero.getHitScore());
		System.out.println();
		// same
	}
}