
public class Bat extends Mammal {
// new mammal = Bat w/ 300 energy
	Mammal bat = new Mammal(300);

// methods: fly, eat humans, attack town
	public void fly() {
		System.out.println("Wooshhh (bat takeoff)");
		reduceEnergy(50);
		bat.displayEnergy();
	}
	
	public void eatHumans() {
		System.out.println("uhm.. lots of screams");
		gainEnergy(25);
		bat.displayEnergy();
	}
	
	public void attackTown() {
		System.out.println("You hear the lovely sound of burning and crackling wood.. and bones");
		reduceEnergy(100);
		bat.displayEnergy();
	}
	
}
