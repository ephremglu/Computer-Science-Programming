package dungeon;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCreateRandomRoom {

	@Test
	void testCreateRandomRoom() {
		Room[][] testDungeon = new Room[5][5];
		DungeonFactory.createRandomRoom(testDungeon);
		if (testDungeon[2][2] != null) {
			assertNotNull(testDungeon[2][2]);
		} else {
			fail("Not yet implemented");
		}
	}
}