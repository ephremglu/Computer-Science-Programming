package dungeon;

public interface MonsterFactory {
	public static Monster addCharacter(int type) {
		Monster monster = null;
		if (type == 1) {
			monster = new Monster("Oscar the Ogre", 200, 2, .6, 30, 50);
			monster.setStrike(setStrike());
			return monster;
		}
		if (type == 2) {
			monster = new Monster("Gnarltooth the Gremlin", 70, 5, .8, 15, 30);
			monster.setStrike(setStrike());
			return monster;
		}
		if (type == 3) {
			monster = new Monster("Sargath the Skeleton", 100, 3, .8, 30, 50);
			monster.setStrike(setStrike());
			return monster;
		}
		if (type == 4) {
			monster = new Monster("Billy the Zombie", 250, 7, .6, 50, 100);
			monster.setStrike(setStrike());
			return monster;
		}
		if (type == 5) {
			monster = new Monster("Drake the Dragon", 200, 5, .5, 40, 80);
			monster.setStrike(setStrike());
			return monster;
		}
		return monster;
	}

	public static Attack setStrike() {
		return new monsterAttack();
	}
}