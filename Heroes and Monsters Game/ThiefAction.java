public class ThiefAction implements Actions {

	public void setActions(DungeonCharacter enemy, DungeonCharacter hero) {
		double surprise = Math.random();
		if (surprise <= .4) {
			System.out.println("Surprise attack was successful!\n" + hero.getName() + " gets an additional turn.");
			hero.addTurnsNum();
			hero.strike(enemy);
		} else if (surprise >= .9) {
			System.out.println("Uh oh! " + enemy.getName() + " saw you and" + " blocked your attack!");
		} else
			hero.strike(enemy);
		//same
	}
}