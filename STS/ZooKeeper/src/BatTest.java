
public class BatTest {
	public static void main(String[] args) {
	
		Bat batBot = new Bat();
	
		//attack 3 towns
		batBot.attackTown();
		batBot.attackTown();
		batBot.attackTown();
		//eat 2 humans
		batBot.eatHumans();
		batBot.eatHumans();
		//fly 2 times
		batBot.fly();
		batBot.fly();
	}
}
