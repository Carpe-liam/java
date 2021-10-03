package com.hackathon;
import java.util.Random;

public class Ninja extends Human {
	Random rand = new Random();
	
	private int strength = 50;
	
	public void boopAttack(Monster monster  ) {
		if(this.energy > 10) {
			System.out.println("Ninja boops " + monster);
			monster.health -= strength;
			this.energy -= 10;			
		} else {
			System.out.println("Your body is weary. You should rest.");
		}
	}
	public void throwAttack(Monster monster  ) {
		if(this.energy > 20) {
			System.out.println("Ninja throws knife at " + monster);
			int roll = rand.nextInt(10);
			if(roll >5) {
				monster.health -= (strength *1.5);
				System.out.println("Knife hits!");
				this.energy -= 20;			
			} else {
				System.out.println("Knife missed!");
				this.energy -= 20;
			}
		} else {
			System.out.println("Your body is weary. You should rest.");
		}
	}
	public void sneakAttack(Monster monster  ) {
		if(this.energy > 30) {
			System.out.println("Ninja throws knife at " + monster);
			int roll = rand.nextInt(10);
			if(roll >7) {
				monster.health -= (strength *2);
				System.out.println("sneak success!");
				this.energy -= 10;			
			} else {
				System.out.println("sneak failed!");
				this.health -= 30;
				this.energy -= 10;
			}			
		} else {
			System.out.println("Your body is weary. You should rest.");
		}
	}
	public void rest() {
		System.out.println("Needs a sneaky nap");
		int roll = rand.nextInt(10);
		if(roll > 3) {
			System.out.println("Sleep was wondeful");
		} else {
			System.out.println("Not a chance buddy");
		}
		
	}
}
