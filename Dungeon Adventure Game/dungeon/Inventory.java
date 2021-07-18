package dungeon;

public class Inventory {

	private int healingPotionCount;
	private int pillarOfOOCount;
	private int visionPotionCount;
	private HealPotion healPotion = new HealPotion();
	private VisionPotion visionPotion = new VisionPotion();

	public int getHealingPotionCount() {
		return this.healingPotionCount;
	}

	public void setHealingPotionCount(int potionAmount) {
		this.healingPotionCount = potionAmount;
	}

	public HealPotion getHealPotion() {
		return this.healPotion;
	}

	public int getPillarOfOOCount() {
		return this.pillarOfOOCount;
	}

	public void setPillarOfOOCount(int pillarAmount) {
		this.pillarOfOOCount = pillarAmount;
	}

	public int getVisionPotionCount() {
		return this.visionPotionCount;
	}

	public void setVisionPotionCount(int visionPotionAmount) {
		this.visionPotionCount = visionPotionAmount;
	}

	public VisionPotion getVisionPotion() {
		return this.visionPotion;
	}

	public String toString() {
		String inventory = "";
		inventory += "\n";
		inventory += "Healing Potion: " + healingPotionCount;
		inventory += "\n";
		inventory += "Pillars of OO: " + pillarOfOOCount;
		inventory += "\n";
		inventory += "Vision Potion: " + visionPotionCount;
		inventory += "\n";
		return inventory;
	}

}