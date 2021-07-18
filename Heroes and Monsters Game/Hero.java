import java.util.Scanner;

public class Hero extends DungeonCharacter {
	private double block;
	private int turnsNum;
	private Actions action;

	public Hero(String name, int hitScore, int strikeSpeed, double hit, int minDamage, int maxDamage, double block) {
		super(name, hitScore, strikeSpeed, hit, minDamage, maxDamage);
		this.block = block;
		super.setName(name());
		// same
	}

	public String name() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter character name: ");
		String name = scanner.nextLine();
		return name;
	}

	public boolean guard() {
		return Math.random() <= this.block;
		// same
	}

	public void subHitScore(int hitScore) {
		if (guard()) {
			System.out.println(getName() + " BLOCKED the attack!");
		} else {
			super.subHitScore(hitScore);
		}
		// same
	}

	public void setActions(Actions action) {
		this.action = action;
	}

	public void takeAction(DungeonCharacter enemy) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a choice:");
		System.out.println("1: Attack");
		System.out.println("2: Special Move");
		while (choice > 2 || choice < 1) {
			choice = Integer.parseInt(sc.nextLine());
			if (choice == 1)
				this.strike(enemy);
			else if (choice == 2)
				action.setActions(enemy, this);
			else
				System.out.println("Invalid choice!");
		}
	}

	public void addTurnsNum() {
		turnsNum++;
	}
}