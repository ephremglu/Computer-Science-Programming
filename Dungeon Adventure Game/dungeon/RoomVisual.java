package dungeon;

public class RoomVisual {

	private String[][] roomVisual = new String[3][3];

	public RoomVisual(final String doorPointNorth, final String doorPointWest, final String doorPointEast,
			final String doorPointSouth, final String objectInRoom) {

		this.roomVisual[0][0] = "*";
		this.roomVisual[0][1] = doorPointNorth;
		this.roomVisual[0][2] = "*";
		this.roomVisual[1][0] = doorPointWest;
		this.roomVisual[1][1] = objectInRoom;
		this.roomVisual[1][2] = doorPointEast;
		this.roomVisual[2][0] = "*";
		this.roomVisual[2][1] = doorPointSouth;
		this.roomVisual[2][2] = "*";

	}

	public String toString() {
		String roomVisual = "";

		for (int i = 0; i < 3; i++) {
			roomVisual += this.roomVisual[0][i];
		}
		roomVisual += "\n";
		for (int i = 0; i < 3; i++) {
			roomVisual += this.roomVisual[1][i];
		}
		roomVisual += "\n";
		for (int i = 0; i < 3; i++) {
			roomVisual += this.roomVisual[2][i];
		}

		return roomVisual;
	}

	public String getDoorPointNorth() {
		return this.roomVisual[0][1];
	}

	public String getDoorPointWest() {
		return this.roomVisual[1][0];
	}

	public String getDoorPointEast() {
		return this.roomVisual[1][2];
	}

	public String getDoorPointSouth() {
		return this.roomVisual[2][1];
	}

	public String getNWCorner() {
		return this.roomVisual[0][0];
	}

	public String getSWCorner() {
		return this.roomVisual[2][0];
	}

	public String getNECorner() {
		return this.roomVisual[0][2];
	}

	public String getSECorner() {
		return this.roomVisual[2][2];
	}

	public String getObjectInRoom() {
		return this.roomVisual[1][1];
	}

	public void setEmptyRoom() {
		if (this.roomVisual[1][1] == "O") {
			this.roomVisual[1][1] = "O";
		} else if (this.roomVisual[1][1] == "I") {
			this.roomVisual[1][1] = "I";
		} else {
			this.roomVisual[1][1] = "E";
		}
	}

}