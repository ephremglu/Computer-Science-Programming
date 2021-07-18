package dungeon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCreateDungeon {

	@Test
	void testCreateDungeon() {
		Room[][] myDungeon = DungeonFactory.createDungeon();
		if (myDungeon != null) {
			assertNotNull(myDungeon);
		} else {
			fail("Not yet implemented");
		}
	}
}