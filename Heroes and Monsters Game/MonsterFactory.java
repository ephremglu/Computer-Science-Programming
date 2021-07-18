public interface MonsterFactory {
	public static Monster addCharacter(int type) {
		Monster monster = null;
		if (type == 1) {
			monster = new Monster("Oscar the Ogre", 200, 2, .6, 30, 50);
			monster.setStrike(setStrike(type));
			return monster;
		}
		if (type == 2) {
			monster = new Monster("Gnarltooth the Gremlin", 70, 5, .8, 15, 30);
			monster.setStrike(setStrike(type));
			return monster;
		}
		if (type == 3) {
			monster = new Monster("Sargath the Skeleton", 100, 3, .8, 30, 50);
			monster.setStrike(setStrike(type));
			return monster;
		}
		return monster;
	}

	public static strikeBack setStrike(int type) {
		if (type == 1) {
			return new OgreStrike();
		}
		if (type == 2) {
			return new GremlinStrike();
		}
		if (type == 3) {
			return new SkeletonStrike();
		} else {
			return new OgreStrike();
		}
	}
}