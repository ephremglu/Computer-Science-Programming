package dungeon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HeroFactoryTest {
	@Test
	void testAddCharacterOne() {

		Hero theHero = HeroFactory.addCharacter(1);
		if (theHero != null) {
			assertNotNull(theHero);
		} else {
			fail("Not yet implemented");
		}
	}

	void testAddCharacterTwo() {

		Hero theHero = HeroFactory.addCharacter(2);
		if (theHero != null) {
			assertNotNull(theHero);
		} else {
			fail("Not yet implemented");
		}
	}

	void testAddCharacterThree() {

		Hero theHero = HeroFactory.addCharacter(3);
		if (theHero != null) {
			assertNotNull(theHero);
		} else {
			fail("Not yet implemented");
		}
	}

	void testAddCharacterFour() {

		Hero theHero = HeroFactory.addCharacter(4);
		if (theHero != null) {
			assertNotNull(theHero);
		} else {
			fail("Not yet implemented");
		}
	}

	void testAddCharacterFive() {

		Hero theHero = HeroFactory.addCharacter(5);
		if (theHero != null) {
			assertNotNull(theHero);
		} else {
			fail("Not yet implemented");
		}
	}
}
