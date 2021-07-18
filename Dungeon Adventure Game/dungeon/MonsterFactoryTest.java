package dungeon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MonsterFactoryTest {

	@Test
	void testAddCharacterOne() {

		Monster theMonster = MonsterFactory.addCharacter(1);
		if (theMonster != null) {
			assertNotNull(theMonster);
		} else {
			fail("Not yet implemented");
		}
	}

	@Test
	void testAddCharacterTwo() {

		Monster theMonster = MonsterFactory.addCharacter(2);
		if (theMonster != null) {
			assertNotNull(theMonster);
		} else {
			fail("Not yet implemented");
		}
	}

	@Test
	void testAddCharacterThree() {

		Monster theMonster = MonsterFactory.addCharacter(3);
		if (theMonster != null) {
			assertNotNull(theMonster);
		} else {
			fail("Not yet implemented");
		}
	}

	@Test
	void testAddCharacterFour() {

		Monster theMonster = MonsterFactory.addCharacter(4);
		if (theMonster != null) {
			assertNotNull(theMonster);
		} else {
			fail("Not yet implemented");
		}
	}

	@Test
	void testAddCharacterFive() {

		Monster theMonster = MonsterFactory.addCharacter(5);
		if (theMonster != null) {
			assertNotNull(theMonster);
		} else {
			fail("Not yet implemented");
		}
	}

}
