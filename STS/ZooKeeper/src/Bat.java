
public class Bat extends Mammal {
// new mammal = Bat w/ 300 energy	
	public Bat() {
		super(300);
	}

// methods: fly, eat humans, attack town
	public void fly() {
		System.out.println("Wooshhh (bat takeoff)");
		reduceEnergy(50);
		this.displayEnergy();
	}
	
	public void eatHumans() {
		System.out.println("uhm.. lots of screams");
		gainEnergy(25);
		this.displayEnergy();
	}
	
	public void attackTown() {
		System.out.println("You hear the lovely sound of burning and crackling wood.. and bones");
		reduceEnergy(100);
		this.displayEnergy();
	}
	
}
