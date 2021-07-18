package dungeon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DungeonCharacterTest {

	@Test
	void testAddHitScore() {
		Hero hero = HeroFactory.addCharacter(1);
		Monster monster = MonsterFactory.addCharacter(1);
		int heroScore = hero.getHitScore();
		hero.addHitScore(10);
		if (heroScore != hero.getHitScore()) {
			assertNotEquals(heroScore, hero.getHitScore());
		} else {
			fail("Not yet implemented");
		}
	}

	@Test
	void testSubHitScore() {
		Hero hero = HeroFactory.addCharacter(1);
		Monster monster = MonsterFactory.addCharacter(5);
		int heroScore = hero.getHitScore();
		while (hero.alive() == true) {
			hero.subHitScore(heroScore);
		}
		if (hero.alive() == false) {
			assertFalse(hero.alive());
		} else {
			fail("Not yet implemented");
		}
	}

	@Test
	void testStrike() {
		Hero hero = HeroFactory.addCharacter(1);
		Monster monster = MonsterFactory.addCharacter(5);
		int heroScore = hero.getHitScore();
		while (hero.alive() == true) {
			hero.subHitScore(heroScore);
		}
		if (hero.alive() == false) {
			assertFalse(hero.alive());
		} else {
			fail("Not yet implemented");
		}
	}

	@Test
	void testAlive() {
		Hero hero = HeroFactory.addCharacter(5);
		if (hero.alive() == true) {
			assertTrue(hero.alive());
		} else {
			fail("Not yet implemented");
		}
	}

}
