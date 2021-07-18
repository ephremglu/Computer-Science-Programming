package dungeon;

import java.util.Scanner;

public class Dungeon {

	private Room[][] dungeon = new DungeonFactory().createDungeon();
	private Room currentRoom;
	private int row;
	private int column;
	private Hero theHero;

	public Dungeon(Hero theHero, Monster theMonster) {
		this.currentRoom = dungeon[0][0];
		this.row = 0;
		this.column = 0;
		this.theHero = theHero;
	}

	public Room[][] getDungeon() {
		return this.dungeon;
	}

	public Room getRoom(final int rowValue, final int columnValue) {
		return this.dungeon[rowValue][columnValue];
	}

	public void setRoom(final int rowValue, final int columnValue) {
		this.currentRoom = getRoom(rowValue, columnValue);
	}

	public int getRow() {
		return this.row;
	}

	public void setRow(final int row) {
		this.row = row;
	}

	public int getColumn() {
		return this.column;
	}

	public void setColumn(final int column) {
		this.column = column;
	}

	public Hero getHero() {
		return this.theHero;
	}

	public void setHero(Hero heroValue) {
		this.theHero = heroValue;
	}

	public void moveNorth() {
		if (this.currentRoom != null && row != 0) {
			this.currentRoom = dungeon[this.row - 1][this.column];
			this.row = this.row - 1;
			System.out.println("Player moved North!");
			this.dungeon[this.row][this.column].getEncounter().theEncounter(theHero);
			if (this.dungeon[this.row][this.column].getRoomVisual().getObjectInRoom() == "X") {
				this.theHero.battle(theHero);
			}
			this.dungeon[this.row + 1][this.column].setEncounter(new EmptyRoom());
			this.dungeon[this.row + 1][this.column].getRoomVisual().setEmptyRoom();

		} else {
			System.out.println("Cannot move North!");
		}
	}

	public void moveWest() {
		if (this.currentRoom != null && column != 0) {
			this.currentRoom = dungeon[this.row][this.column - 1];
			this.column = this.column - 1;
			System.out.println("Player moved West!");
			this.dungeon[this.row][this.column].getEncounter().theEncounter(theHero);
			if (this.dungeon[this.row][this.column].getRoomVisual().getObjectInRoom() == "X") {
				this.theHero.battle(theHero);
			}
			this.dungeon[this.row][this.column + 1].setEncounter(new EmptyRoom());
			this.dungeon[this.row][this.column + 1].getRoomVisual().setEmptyRoom();

		} else {
			System.out.println("Cannot move West!");
		}
	}

	public void moveEast() {
		if (this.currentRoom != null && column != 4) {
			this.currentRoom = dungeon[this.row][this.column + 1];
			this.column = this.column + 1;
			System.out.println("Player moved East!");
			this.dungeon[this.row][this.column].getEncounter().theEncounter(theHero);
			if (this.dungeon[this.row][this.column].getRoomVisual().getObjectInRoom() == "X") {
				this.theHero.battle(theHero);
			}
			this.dungeon[this.row][this.column - 1].setEncounter(new EmptyRoom());
			this.dungeon[this.row][this.column - 1].getRoomVisual().setEmptyRoom();

		} else {
			System.out.println("Cannot move East!");
		}
	}

	public void moveSouth() {
		if (this.currentRoom != null && row != 4) {
			this.currentRoom = dungeon[this.row + 1][this.column];
			this.row = this.row + 1;
			System.out.println("Player moved South!");
			this.dungeon[this.row][this.column].getEncounter().theEncounter(theHero);
			if (this.dungeon[this.row][this.column].getRoomVisual().getObjectInRoom() == "X") {
				this.theHero.battle(theHero);
			}
			this.dungeon[this.row - 1][this.column].setEncounter(new EmptyRoom());
			this.dungeon[this.row - 1][this.column].getRoomVisual().setEmptyRoom();

		} else {
			System.out.println("Cannot move South!");
		}
	}

	public void navigateDungeon() {
		while (this.currentRoom != dungeon[0][4] || this.theHero.getInventory().getPillarOfOOCount() < 4) {
			if (this.theHero.getHitScore() <= 0) {
				break;
			}
			currentRoom();
			int choice = 0;
			Scanner sc = new Scanner(System.in);
			while (choice < 1 || choice > 7) {
				System.out.println("Please enter a movement choice:");
				System.out.println("1.) Move North");
				System.out.println("2.) Move West");
				System.out.println("3.) Move East");
				System.out.println("4.) Move South");
				System.out.println("5.) Use Vision Potion");
				System.out.println("6.) View Inventory");
				System.out.println("7.) (Cheat) View Inventory");
				choice = Integer.parseInt(sc.nextLine());
			}
			if (choice == 1) {
				moveNorth();
			} else if (choice == 2) {
				moveWest();
			} else if (choice == 3) {
				moveEast();
			} else if (choice == 4) {
				moveSouth();
			} else if (choice == 5) {
				theHero.getInventory().getVisionPotion().useVisionPotion(this);
			} else if (choice == 6) {
				System.out.println(theHero.getInventory().toString());
			} else {
				displayDungeon();
			}
		}
	}

	public void currentRoom() {
		System.out.println();
		System.out.println("Row: " + this.row + " Column: " + this.column);
		System.out.println(dungeon[row][column].toString());
		System.out.println();
	}

	public void displayDungeon() {
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(
						dungeon[j][i].getRoomVisual().getNWCorner() + dungeon[j][i].getRoomVisual().getDoorPointNorth()
								+ dungeon[j][i].getRoomVisual().getNECorner());
			}
			System.out.println();
			for (int i = 0; i < 5; i++) {
				System.out.print(dungeon[0][i].getRoomVisual().getDoorPointWest()
						+ dungeon[j][i].getRoomVisual().getObjectInRoom()
						+ dungeon[j][i].getRoomVisual().getDoorPointEast());
			}
			System.out.println();
			for (int i = 0; i < 5; i++) {
				System.out.print(
						dungeon[0][i].getRoomVisual().getSWCorner() + dungeon[j][i].getRoomVisual().getDoorPointSouth()
								+ dungeon[j][i].getRoomVisual().getSECorner());
			}
			System.out.println();
		}
	}

}
