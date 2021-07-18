package dungeon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSetEmptyRoom {

	@Test
	void testSetEmptyRoom() {
		RoomVisual theVisual = new RoomVisual("-", "|", "|", "-", "X");
		String beforeChange = theVisual.getObjectInRoom();
		theVisual.setEmptyRoom();
		if (beforeChange != theVisual.getObjectInRoom()) {
			assertNotEquals(beforeChange, theVisual.getObjectInRoom());
		} else {
			fail("Not yet implemented");
		}
	}
}