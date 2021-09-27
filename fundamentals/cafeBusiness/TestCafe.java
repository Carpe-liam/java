import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TestCafe {
    
	public static void main(String[] args) {
	    // TO-DO:
	    // Create an instance of the CafeUtil class        
	    // in order to use the CafeUtil class' methods.
        CafeUtil cafeBot = new CafeUtil();
    
	    // Hint: it will need to correspond with the variable name
	    // used in your test code.
		System.out.println("\n");
	    // Given Test Cases Here
// streak goal
        System.out.println("----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n", cafeBot.getStreakGoal());
// price chart
        System.out.println("----- Price Chart Test-----");
        cafeBot.printPriceChart("Chai Latte Mix", 4.5, 3);
        cafeBot.printPriceChart("Specialty Coaster", 2.0, 5);
// order total
		System.out.println("\n----- Order Total Test-----");
		double[] lineItems = {3.5, 1.5, 4.0, 4.5};
		System.out.printf("Order total: %s \n",cafeBot.getOrderTotal(lineItems));
// display menu
		System.out.println("----- Display Menu Test-----");
		List<String> loadMenu = Arrays.asList( "drip coffee", "cappucino", "latte", "mocha" );
		List<Double> loadPrices = Arrays.asList(1.5, 3.5, 4.5, 3.5);
		ArrayList<String> menu = new ArrayList<String>();
		ArrayList<Double> prices = new ArrayList<Double>();
		// Note: Below is a way to add multiple elements to a list in fewer lines.
		// It does require an extra import at the top of the file.
		menu.addAll(loadMenu);
		prices.addAll(loadPrices);
		cafeBot.displayMenu(menu, prices);
// add customer
		System.out.println("\n----- Add Customer Test-----");
		ArrayList<String> customers = new ArrayList<String>();
		// Test 4 times
		for (int i = 0; i < 4; i++) { 
			cafeBot.addCustomer(customers); 
			System.out.println(customers);
		}



	}
}
