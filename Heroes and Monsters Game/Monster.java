public class Monster extends DungeonCharacter {

	private strikeBack strike;

	public Monster(String name, int hitScore, int strikeSpeed, double hit, int minDamage, int maxDamage) {
		super(name, hitScore, strikeSpeed, hit, minDamage, maxDamage);
		// same
	}

	public void setStrike(strikeBack strike) {
		this.strike = strike;
	}

	public void strike(DungeonCharacter enemy) {
		this.strike.strike(enemy, this);
		super.strike(enemy);
	}
}