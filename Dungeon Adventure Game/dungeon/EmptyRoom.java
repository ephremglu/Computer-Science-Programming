package dungeon;

public class EmptyRoom extends Encounters {

	public void theEncounter(Hero theHero) {
		System.out.println("This room is empty.");
	}

	public String encounterName() {
		return "E";
	}
}