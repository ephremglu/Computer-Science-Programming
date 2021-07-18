public class TestSauronEye 
{
	public static void main(String[] args) 
	{
		EyeOfSauron eye = new EyeOfSauron();
		BadGuy saruman = new BadGuy(eye, "Saruman");
		BadGuy witchKing = new BadGuy(eye, "Witch King");
		int hobbitNum = 1;
		int elfNum = 1;
		int dwarfNum = 2;
		int menNum = 0;
		eye.setEnemies(hobbitNum, elfNum, dwarfNum, menNum); // hobbits, elves, dwarves, men

		// setEnemies call should result in a message from Saruman

		// and the Witch King that they know about 1 hobbit, 1 elf, 2 dwarves
		// BTW, the above numbers are HORRIBLE coding style and a bad code smell

		saruman.defeated(); // Saruman is no longer registered with the Eye
		hobbitNum = 4;
		elfNum = 2;
		dwarfNum = 2;
		menNum = 100;
		eye.setEnemies(hobbitNum, elfNum, dwarfNum, menNum); // only the Witch King reports on the enemies
	}
}