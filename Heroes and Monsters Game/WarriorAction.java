public class WarriorAction implements Actions {

	public void setActions(DungeonCharacter enemy, DungeonCharacter hero) {
		if (Math.random() <= .4) {
			int damage = (int) (Math.random() * 76) + 100;
			System.out.println(hero.getName() + " lands a CRUSHING BLOW for " + damage + " damage!");
			enemy.subHitScore(damage);
		}
		else {
			System.out.println(hero.getName() + " failed to land a crushing blow");
			System.out.println();
		} 
		//same
	}
}