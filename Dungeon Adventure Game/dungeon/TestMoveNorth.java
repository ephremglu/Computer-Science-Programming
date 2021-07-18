package dungeon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMoveNorth {

	@Test
	void testMoveNorth() {
		Dungeon myDungeon = new Dungeon(HeroFactory.addCharacter(1), MonsterFactory.addCharacter(1));
		myDungeon.setRoom(2, 2);
		myDungeon.setRow(2);
		myDungeon.setColumn(2);
		int initialRow = myDungeon.getRow();
		int initialColumn = myDungeon.getColumn();
		myDungeon.moveNorth();
		if (initialRow - 1 == myDungeon.getRow()) {
			assertEquals(initialRow - 1, myDungeon.getRow());
		} else {
			fail("Not yet implemented");
		}
	}
}