package dungeon;

public class VisionPotion extends Encounters {

	public void theEncounter(Hero theHero) {
		System.out.println("The hero found a vision potion.");
		theHero.getInventory().setVisionPotionCount(theHero.getInventory().getVisionPotionCount() + 1);
	}

	public String encounterName() {
		return "V";
	}

	public void useVisionPotion(Dungeon theDungeon) {
		if (theDungeon.getHero().getInventory().getVisionPotionCount() < 1) {
			System.out.println("No vision potions left.");
		} else {
			theDungeon.getHero().getInventory()
					.setVisionPotionCount(theDungeon.getHero().getInventory().getVisionPotionCount() - 1);
			;
			showNorth(theDungeon);
			showNW(theDungeon);
			showWest(theDungeon);
			showSW(theDungeon);
			showSouth(theDungeon);
			showSE(theDungeon);
			showEast(theDungeon);
			showNE(theDungeon);
		}
	}

	public void showNorth(Dungeon theDungeon) {
		if (theDungeon.getRow() == 0) {
			System.out.println("No north room.");
		} else {
			System.out.println("North Room: ");
			System.out.println();
			System.out.println(
					theDungeon.getRoom(theDungeon.getRow() - 1, theDungeon.getColumn()).getRoomVisual().toString());
		}
	}

	public void showWest(Dungeon theDungeon) {
		if (theDungeon.getColumn() == 0) {
			System.out.println("No West room.");
		} else {
			System.out.println("West Room: ");
			System.out.println();
			System.out.println(
					theDungeon.getRoom(theDungeon.getRow(), theDungeon.getColumn() - 1).getRoomVisual().toString());
		}
	}

	public void showNW(Dungeon theDungeon) {
		if (theDungeon.getColumn() == 0 || theDungeon.getRow() == 0) {
			System.out.println("No NW room.");
		} else {
			System.out.println("NW Room: ");
			System.out.println();
			System.out.println(
					theDungeon.getRoom(theDungeon.getRow() - 1, theDungeon.getColumn() - 1).getRoomVisual().toString());
		}
	}

	public void showNE(Dungeon theDungeon) {
		if (theDungeon.getColumn() == 4 || theDungeon.getRow() == 0) {
			System.out.println("No NE room.");
		} else {
			System.out.println("NE Room: ");
			System.out.println();
			System.out.println(
					theDungeon.getRoom(theDungeon.getRow() - 1, theDungeon.getColumn() + 1).getRoomVisual().toString());
		}
	}

	public void showEast(Dungeon theDungeon) {
		if (theDungeon.getColumn() == 4) {
			System.out.println("No East room.");
		} else {
			System.out.println("East Room: ");
			System.out.println();
			System.out.println(
					theDungeon.getRoom(theDungeon.getRow(), theDungeon.getColumn() + 1).getRoomVisual().toString());
		}
	}

	public void showSouth(Dungeon theDungeon) {
		if (theDungeon.getRow() == 4) {
			System.out.println("No South room.");
		} else {
			System.out.println("South Room: ");
			System.out.println();
			System.out.println(
					theDungeon.getRoom(theDungeon.getRow() + 1, theDungeon.getColumn()).getRoomVisual().toString());
		}
	}

	public void showSW(Dungeon theDungeon) {
		if (theDungeon.getColumn() == 0 || theDungeon.getRow() == 4) {
			System.out.println("No SW room.");
		} else {
			System.out.println("SW Room: ");
			System.out.println();
			System.out.println(
					theDungeon.getRoom(theDungeon.getRow() + 1, theDungeon.getColumn() - 1).getRoomVisual().toString());
		}
	}

	public void showSE(Dungeon theDungeon) {
		if (theDungeon.getColumn() == 4 || theDungeon.getRow() == 4) {
			System.out.println("No SW room.");
		} else {
			System.out.println("SW Room: ");
			System.out.println();
			System.out.println(
					theDungeon.getRoom(theDungeon.getRow() + 1, theDungeon.getColumn() + 1).getRoomVisual().toString());
		}
	}

}