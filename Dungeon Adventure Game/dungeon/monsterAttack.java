package dungeon;

public class monsterAttack implements Attack {

	@Override
	public void setAttack(DungeonCharacter enemy, DungeonCharacter monster) {

		if (monster.getName() == "Oscar the Ogre") {
			System.out.println(monster.getName() + " slowly swings a club toward's " + enemy.getName() + ":");
		} else if (monster.getName() == "Gnarltooth the Gremlin") {
			System.out.println(monster.getName() + " jabs his kris at " + enemy.getName() + ":");
		} else if (monster.getName() == "Sargath the Skeleton") {
			System.out.println(monster.getName() + " slices his rusty blade at " + enemy.getName() + ":");
		} else if (monster.getName() == "Billy the Zombie") {
			System.out.println(monster.getName() + " lands its PUNCH at " + enemy.getName() + ":");
		} else if (monster.getName() == "Drake the Dragon") {
			System.out.println(monster.getName() + " throws a fire ball at " + enemy.getName() + ":");
		}
	}
}