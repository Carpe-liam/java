package com.hackathon;

public class LivingThing {
//member variables
	protected int health;
	protected int energy;
	protected int strength;
	protected int speed; 

//methods
	public void attack(String isAttacked, int strength, Monster monster) {
		monster.getHealth();
		monster.health -= strength;
	}
	
	
// getters & setters
	public int getHealth() {
		return health;
	}
	public int getStrength() {
		return strength;
	}
	public int getEnergy() {
		return energy;
	}
		public int getSpeed() {
		return speed;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
