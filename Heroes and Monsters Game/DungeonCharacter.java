public abstract class DungeonCharacter implements Comparable {
	private String name;
	private int turnsNum;
	private double hit;
	private int hitScore;
	private int strikeSpeed;
	private int minDamage;
	private int maxDamage;

	public DungeonCharacter(String name, int hitScore, int strikeSpeed, double hit, int minDamage, int maxDamage) {
		this.name = name;
		this.hitScore = hitScore;
		this.strikeSpeed = strikeSpeed;
		this.hit = hit;
		this.minDamage = minDamage;
		this.maxDamage = maxDamage;
		// same
	}

	public String getName() {
		return name;
		// same
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHitScore() {
		return hitScore;
		// same
	}

	public int getMaxDamage() {
		return this.maxDamage;
	}

	public int getMinDamage() {
		return this.minDamage;
	}

	public void addHitScore(int hitScore) {
		if (hitScore <= 0)
			System.out.println("The hitScore is less than or equal to zero!");
		else {
			this.hitScore += hitScore;
			// same
		}
	}

	public void subHitScore(int hitScore) {
		if (hitScore < 0)
			System.out.println("Hitpoint amount must be positive.");
		else if (hitScore > 0) {
			this.hitScore -= hitScore;
			if (this.hitScore < 0)
				this.hitScore = 0;
			System.out.println(getName() + " hit " + " for <" + hitScore + "> points damage.");
			System.out.println(getName() + " now has " + getHitScore() + " hit points remaining.");
			System.out.println();
		}
		if (this.hitScore == 0)
			System.out.println(this.name + " has been killed :-(");
		// same
	}

	public int getStrikeSpeed() {
		return strikeSpeed;
		// same
	}

	public void strike(DungeonCharacter enemy) {
		boolean hitBack;
		int damageTaken;
		hitBack = Math.random() <= this.hit;
		if (hitBack) {
			damageTaken = (int) (Math.random() * (this.maxDamage - this.minDamage + 1)) + this.minDamage;
			enemy.subHitScore(damageTaken);
			System.out.println();
		} else {
			System.out.println(getName() + "'s attack on " + enemy.getName() + " failed!");
			System.out.println();
			// same
		}
	}

	public boolean alive() {
		return (this.hitScore > 0);
		// same
	}

	public void addTurnsNum() {
		this.turnsNum++;
		// same
	}

	public int compareTo(Object o) {
		return 1;
		// same
	}
}