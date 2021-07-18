package dungeon;

public class DungeonFactory {

	public static Room[][] createDungeon() {
		Room[][] theDungeon = new Room[5][5];

		// Corner Rooms
		theDungeon[0][0] = new Room(new RoomVisual("*", "*", "|", "-", "P"), new Pit());
		theDungeon[0][4] = new Room(new RoomVisual("*", "|", "*", "-", "O"), new DungeonExit());
		theDungeon[4][0] = new Room(new RoomVisual("-", "*", "|", "*", "I"), new EmptyRoom());
		theDungeon[4][4] = new Room(new RoomVisual("-", "|", "*", "*", "P"), new Pit());

		// North Rooms
		theDungeon[0][1] = new Room(new RoomVisual("*", "|", "|", "-", "V"), new VisionPotion());
		theDungeon[0][2] = new Room(new RoomVisual("*", "|", "|", "-", "X"), new MonsterEncounter());
		theDungeon[0][3] = new Room(new RoomVisual("*", "|", "|", "-", "M"), new MultipleItems());

		// West Rooms
		theDungeon[1][0] = new Room(new RoomVisual("-", "*", "|", "-", "V"), new VisionPotion());
		theDungeon[2][0] = new Room(new RoomVisual("-", "*", "|", "-", "X"), new MonsterEncounter());
		theDungeon[3][0] = new Room(new RoomVisual("-", "*", "|", "-", "M"), new MultipleItems());

		// East Rooms
		theDungeon[1][4] = new Room(new RoomVisual("-", "|", "*", "-", "M"), new MultipleItems());
		theDungeon[2][4] = new Room(new RoomVisual("-", "|", "*", "-", "X"), new MonsterEncounter());
		theDungeon[3][4] = new Room(new RoomVisual("-", "|", "*", "-", "V"), new VisionPotion());

		// South Rooms
		theDungeon[4][1] = new Room(new RoomVisual("-", "|", "|", "*", "M"), new MultipleItems());
		theDungeon[4][2] = new Room(new RoomVisual("-", "|", "|", "*", "X"), new MonsterEncounter());
		theDungeon[4][3] = new Room(new RoomVisual("-", "|", "|", "*", "V"), new VisionPotion());

		// Center Rooms
		createRandomRoom(theDungeon);

		return theDungeon;
	}

	public static void createRandomRoom(Room[][] theDungeon) {
		int pillarCount = 0;
		for (int j = 1; j < 4; j++) {
			for (int i = 1; i < 4; i++) {
				double chance = Math.random() * 5;
				if (j == 3 && pillarCount < 4) {
					theDungeon[j][i] = new Room(new RoomVisual("-", "|", "|", "-", new PillarOfOO().encounterName()),
							new PillarOfOO());
					pillarCount++;
				} else if (pillarCount < 4 && i == 3) {
					theDungeon[j][i] = new Room(new RoomVisual("-", "|", "|", "-", new PillarOfOO().encounterName()),
							new PillarOfOO());
					pillarCount++;
				} else if (chance <= 1 && pillarCount < 4) {
					theDungeon[j][i] = new Room(new RoomVisual("-", "|", "|", "-", new PillarOfOO().encounterName()),
							new PillarOfOO());
					pillarCount++;
				} else if (chance <= 2 && chance > 1) {
					theDungeon[j][i] = new Room(new RoomVisual("-", "|", "|", "-", new HealPotion().encounterName()),
							new HealPotion());
				} else if (chance <= 3 && chance > 2) {
					theDungeon[j][i] = new Room(new RoomVisual("-", "|", "|", "-", new VisionPotion().encounterName()),
							new VisionPotion());
				} else if (chance <= 4 && chance > 3) {
					theDungeon[j][i] = new Room(new RoomVisual("-", "|", "|", "-", new MultipleItems().encounterName()),
							new MultipleItems());
				} else {
					theDungeon[j][i] = new Room(new RoomVisual("-", "|", "|", "-", new EmptyRoom().encounterName()),
							new EmptyRoom());
				}
			}
		}
	}
}
