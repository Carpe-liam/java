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

	    // Given Test Cases Here
// streak goal
        System.out.println("----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n", cafeBot.getStreakGoal());
// price chart
        System.out.println("----- Price Chart Test-----");
        cafeBot.printPriceChart("Chai Latte Mix", 4.5, 3);
        cafeBot.printPriceChart("Specialty Coaster", 2.0, 5);

	}
}
