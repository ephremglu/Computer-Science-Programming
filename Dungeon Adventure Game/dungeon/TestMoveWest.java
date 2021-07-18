package dungeon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMoveWest {

	@Test
	void testMoveWest() {
		Dungeon myDungeon = new Dungeon(HeroFactory.addCharacter(1), MonsterFactory.addCharacter(1));
		myDungeon.setRoom(2, 2);
		myDungeon.setRow(2);
		myDungeon.setColumn(2);
		int initialRow = myDungeon.getRow();
		int initialColumn = myDungeon.getColumn();
		myDungeon.moveWest();
		if (initialColumn - 1 == myDungeon.getColumn()) {
			assertEquals(initialColumn - 1, myDungeon.getColumn());
		} else {
			fail("Not yet implemented");
		}
	}
}