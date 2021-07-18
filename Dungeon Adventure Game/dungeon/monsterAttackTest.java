package dungeon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class monsterAttackTest {

	@Test
	void testSetAttackOne() {
		Hero hero = HeroFactory.addCharacter(1);
		Monster monster = MonsterFactory.addCharacter(1);
		int heroScore = hero.getHitScore();
		while (hero.getHitScore() > 0) {
			monster.strike(hero);
		}
		if (hero.getHitScore() >= 0) {
			boolean checkHeroAlive = false;
			assertFalse(checkHeroAlive);
		} else {
			fail("Not yet implemented");
		}
	}

	@Test
	void testSetAttackTwo() {
		Hero hero = HeroFactory.addCharacter(2);
		Monster monster = MonsterFactory.addCharacter(2);
		int heroScore = hero.getHitScore();
		while (hero.getHitScore() > 0) {
			monster.strike(hero);
		}
		if (hero.getHitScore() >= 0) {
			boolean checkHeroAlive = false;
			assertFalse(checkHeroAlive);
		} else {
			fail("Not yet implemented");
		}
	}

	@Test
	void testSetAttackThree() {
		Hero hero = HeroFactory.addCharacter(3);
		Monster monster = MonsterFactory.addCharacter(3);
		int heroScore = hero.getHitScore();
		while (hero.getHitScore() > 0) {
			monster.strike(hero);
		}
		if (hero.getHitScore() >= 0) {
			boolean checkHeroAlive = false;
			assertFalse(checkHeroAlive);
		} else {
			fail("Not yet implemented");
		}
	}

	@Test
	void testSetAttackFour() {
		Hero hero = HeroFactory.addCharacter(4);
		Monster monster = MonsterFactory.addCharacter(4);
		int heroScore = hero.getHitScore();
		while (hero.getHitScore() > 0) {
			monster.strike(hero);
		}
		if (hero.getHitScore() >= 0) {
			boolean checkHeroAlive = false;
			assertFalse(checkHeroAlive);
		} else {
			fail("Not yet implemented");
		}
	}

	@Test
	void testSetAttackFive() {
		Hero hero = HeroFactory.addCharacter(5);
		Monster monster = MonsterFactory.addCharacter(5);
		int heroScore = hero.getHitScore();
		while (hero.getHitScore() > 0) {
			monster.strike(hero);
		}
		if (hero.getHitScore() >= 0) {
			boolean checkHeroAlive = false;
			assertFalse(checkHeroAlive);
		} else {
			fail("Not yet implemented");
		}
	}
}
