package dungeon;

public class Room {

	private RoomVisual roomVisual;
	private Encounters encounter;

	public Room(final RoomVisual roomVisual, final Encounters encounter) {

		this.roomVisual = roomVisual;
		this.encounter = encounter;
	}

	public RoomVisual getRoomVisual() {
		return this.roomVisual;
	}

	public Encounters getEncounter() {
		return this.encounter;
	}

	public void setEncounter(Encounters encounter) {
		this.encounter = encounter;
	}

	public String toString() {
		return this.roomVisual.toString();
	}
}