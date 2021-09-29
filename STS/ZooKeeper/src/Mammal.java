
public class Mammal {
// attributes||member variables
	private int energyLevel = 100;

// constructors
	public Mammal() {}
	
	public Mammal(Integer energyParam) {
		this.energyLevel = energyParam;
	}

// methods
	public Integer displayEnergy() {
		System.out.println("Energy level at: " + this.energyLevel);
		return this.energyLevel;
	}
	
	public void reduceEnergy(Integer energyParam) {
		energyLevel -= energyParam;
	}
	
	public void gainEnergy(Integer energyParam) {
		energyLevel += energyParam;
	}
	
}
