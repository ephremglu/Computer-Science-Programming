package dungeon;

public class heroAttack implements Attack {

	@Override
	public void setAttack(DungeonCharacter enemy, DungeonCharacter hero) {

		if (hero.getName() == "Warrior") {

			if (Math.random() <= .4) {
				int damage = (int) (Math.random() * 76) + 100;
				System.out.println(hero.getName() + " lands a CRUSHING BLOW for " + damage + " damage!");
				enemy.subHitScore(damage);
			} else {
				System.out.println(hero.getName() + " failed to land a crushing blow");
				System.out.println();
			}
		} else if (hero.getName() == "Sorceress") {

			int hits;
			int healMin = 25;
			int healMax = 50;
			hits = (int) (Math.random() * (healMax - healMin + 1)) + healMin;
			hero.addHitScore(hits);
			System.out.println(hero.getName() + " added [" + hits + "] points.\n" + "Total hit points remaining are: "
					+ hero.getHitScore());
			System.out.println();
		} else if (hero.getName() == "Thief") {

			double surprise = Math.random();
			if (surprise <= .4) {
				System.out.println("Surprise attack was successful!\n" + hero.getName() + " gets an additional turn.");
				hero.addTurnsNum();
				hero.strike(enemy);
			} else if (surprise >= .9) {
				System.out.println("Uh oh! " + enemy.getName() + " saw you and" + " blocked your attack!");
			} else
				hero.strike(enemy);
		} else if (hero.getName() == "Archer") {

			if (Math.random() <= .4) {
				int damage = (int) (Math.random() * 76) + 125;
				System.out.println(hero.getName() + " shoots an ARROW for " + damage + " damage!");
				enemy.subHitScore(damage);
			} else {
				System.out.println(hero.getName() + " failed to hit target with ARROW!");
				System.out.println();
			}
		} else if (hero.getName() == "Fighter") {
			if (Math.random() <= .4) {
				int damage = (int) (Math.random() * 76) + 125;
				System.out.println(hero.getName() + " lands its PUNCH and causes " + damage + " damage!");
				enemy.subHitScore(damage);
			} else {
				System.out.println(hero.getName() + " failed to punch target");
				System.out.println();
			}
		}
	}
}
