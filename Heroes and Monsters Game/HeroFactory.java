public interface HeroFactory {
	public static Hero addCharacter(int type) {
		Hero hero = null;
		if (type == 1) {
			hero = new Hero("Warrior", 125, 4, .8, 35, 60, .2);
			hero.setActions(setActions(type));
			return hero;
		} else if (type == 2) {
			hero = new Hero("Sorceress", 75, 5, .7, 25, 50, .3);
			hero.setActions(setActions(type));
			return hero;
		} else if (type == 3) {
			hero = new Hero("Thief", 75, 6, .8, 20, 40, .5);
			hero.setActions(setActions(type));
			return hero;
		}
		return hero;
	}

	public static Actions setActions(int type) {
		if (type == 1) {
			return new WarriorAction();
		}
		if (type == 2) {
			return new SorceressAction();
		}
		if (type == 3) {
			return new ThiefAction();
		} else {
			return new WarriorAction();
		}
	}
}