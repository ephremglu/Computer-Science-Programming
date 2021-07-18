package dungeon;

import java.util.Scanner;

public class Hero extends DungeonCharacter {
	private double block;
	private int turnsNum;
	private heroAttack heroAttack;
	private Inventory inventory;

	public Hero(String name, int hitScore, int strikeSpeed, double hit, int minDamage, int maxDamage, double block,
			Inventory inventory) {
		super(name, hitScore, strikeSpeed, hit, minDamage, maxDamage);
		this.block = block;
		super.setName(name());
		this.inventory = inventory;
		// same
	}

	public Inventory getInventory() {
		return this.inventory;
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

	public void reduceHitScore(int hitScore) {
		super.setHitSore(super.getHitScore() - hitScore);
		if (super.getHitScore() < 0) {
			System.out.println("The hero has died.");
		}
	}

	public void setAttack(heroAttack heroAttack) {
		this.heroAttack = heroAttack;
	}

	public void takeAction(DungeonCharacter enemy) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a choice:");
		System.out.println("1: Attack");
		System.out.println("2: Special Move");
		System.out.println("3. Use Heal Potion");
		while (choice > 3 || choice < 1) {
			choice = Integer.parseInt(sc.nextLine());
			if (choice == 1)
				this.strike(enemy);
			else if (choice == 2)
				heroAttack.setAttack(enemy, this);
			else if (choice == 3)
				this.inventory.getHealPotion().useHealingPotion(this);
			else
				System.out.println("Invalid choice!");
		}
	}

	public void addTurnsNum() {
		turnsNum++;
	}

	public void battle(Hero theHero) {
		Monster theMonster = MonsterFactory.addCharacter((int) (1 + Math.random() * 5));
		Scanner scanner = new Scanner(System.in);
		char pause = 'p';
		System.out.println(theHero.getName() + " battles " + theMonster.getName());
		System.out.println("\n");
		while (theHero.alive() == true && theMonster.alive()) {
			theHero.takeAction(theMonster);
			if (theMonster.alive())
				theMonster.strike(theHero);
		}
		if (!theMonster.alive())
			System.out.println(theHero.getName() + " was victorious!");
		else if (!theHero.alive())
			System.out.println(theHero.getName() + " was defeated :-(");
		else
			System.out.println("Keep Fighting");
	}

}
