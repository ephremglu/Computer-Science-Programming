package dungeon;

public interface HeroFactory {
	public static Hero addCharacter(int type) {
		Hero hero = null;
		if (type == 1) {
			hero = new Hero("Warrior", 125, 4, .8, 35, 60, .2, new Inventory());
			hero.setAttack(setAttacks());
			return hero;
		} else if (type == 2) {
			hero = new Hero("Sorceress", 75, 5, .7, 25, 50, .3, new Inventory());
			hero.setAttack(setAttacks());
			return hero;
		} else if (type == 3) {
			hero = new Hero("Thief", 75, 6, .8, 20, 40, .5, new Inventory());
			hero.setAttack(setAttacks());
			return hero;
		} else if (type == 4) {
			hero = new Hero("Archer", 140, 6, .8, 30, 100, .6, new Inventory());
			hero.setAttack(setAttacks());
			return hero;
		} else if (type == 5) {
			hero = new Hero("Fighter", 75, 6, .5, 15, 30, .5, new Inventory());// might change the stats
			hero.setAttack(setAttacks());
			return hero;
		}
		return hero;
	}

	public static heroAttack setAttacks() {
		return new heroAttack();
	}
}