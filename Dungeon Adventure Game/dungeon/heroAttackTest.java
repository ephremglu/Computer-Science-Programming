package dungeon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class heroAttackTest {

	@Test
	void testSetAttackOne() {
		Hero hero = HeroFactory.addCharacter(1);
		Monster monster = MonsterFactory.addCharacter(1);
		int heroScore = hero.getHitScore();
		while (monster.getHitScore() > 0) {
			hero.strike(monster);
		}
		if (monster.getHitScore() >= 0) {
			boolean checkMonsterAlive = false;
			assertFalse(checkMonsterAlive);
		} else {
			fail("Not yet implemented");
		}
	}

	@Test
	void testSetAttackTwo() {
		Hero hero = HeroFactory.addCharacter(2);
		Monster monster = MonsterFactory.addCharacter(2);
		int heroScore = hero.getHitScore();
		while (monster.getHitScore() > 0) {
			hero.strike(monster);
		}
		if (monster.getHitScore() >= 0) {
			boolean checkMonsterAlive = false;
			assertFalse(checkMonsterAlive);
		} else {
			fail("Not yet implemented");
		}
	}

	@Test
	void testSetAttackThree() {
		Hero hero = HeroFactory.addCharacter(3);
		Monster monster = MonsterFactory.addCharacter(3);
		int heroScore = hero.getHitScore();
		while (monster.getHitScore() > 0) {
			hero.strike(monster);
		}
		if (monster.getHitScore() >= 0) {
			boolean checkMonsterAlive = false;
			assertFalse(checkMonsterAlive);
		} else {
			fail("Not yet implemented");
		}
	}

	@Test
	void testSetAttackFour() {
		Hero hero = HeroFactory.addCharacter(4);
		Monster monster = MonsterFactory.addCharacter(4);
		int heroScore = hero.getHitScore();
		while (monster.getHitScore() > 0) {
			hero.strike(monster);
		}
		if (monster.getHitScore() >= 0) {
			boolean checkMonsterAlive = false;
			assertFalse(checkMonsterAlive);
		} else {
			fail("Not yet implemented");
		}
	}

	@Test
	void testSetAttackFive() {
		Hero hero = HeroFactory.addCharacter(5);
		Monster monster = MonsterFactory.addCharacter(5);
		int heroScore = hero.getHitScore();
		while (monster.getHitScore() > 0) {
			hero.strike(monster);
		}
		if (monster.getHitScore() >= 0) {
			boolean checkMonsterAlive = false;
			assertFalse(checkMonsterAlive);
		} else {
			fail("Not yet implemented");
		}
	}
}
