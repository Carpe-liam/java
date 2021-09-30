package com.hackathon;

public abstract class Monster extends LivingThing {
	public Monster(int health, int energy, int strength, int speed) {
		super();
		this.health = health;
		this.energy = energy;
		this.strength = strength;
		this.speed = speed;
	}
}
