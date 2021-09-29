
public class Gorilla extends Mammal{

	
// methods
	public void throwSomething() {
		System.out.println("Gorilla has thrown something!");
		reduceEnergy(5);
		displayEnergy();
	}
	
	public void eatBananas() {
		System.out.println("Gorilla ate some bananas!");		
		gainEnergy(10);
		displayEnergy();
	}
	
	public void climb() {
		System.out.println("Gorilla has goes climbing!");	
		reduceEnergy(10);
		displayEnergy();
	}
	
	
}