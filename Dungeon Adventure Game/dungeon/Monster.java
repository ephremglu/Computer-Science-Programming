package dungeon;

public class Monster extends DungeonCharacter {

	private Attack strike;

	public Monster(String name, int hitScore, int strikeSpeed, double hit, int minDamage, int maxDamage) {
		super(name, hitScore, strikeSpeed, hit, minDamage, maxDamage);
		// same
	}

	public void setStrike(Attack strike) {
		this.strike = strike;
	}

	public void strike(DungeonCharacter enemy) {
		this.strike.setAttack(enemy, this);
		super.strike(enemy);
	}
}