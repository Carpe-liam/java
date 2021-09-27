import java.util.*;
import java.lang.*;

public class CafeUtil {


    public String getStreakGoal() {
        int num = 10;
        int sum =0;
        for(int i=1; i<=num; i++) {
            sum += i;
        }
        return Integer.toString(sum) + "\n";
    } 

    public String getStreakGoal(String numWeeks) {
        int num = Integer.parseInt(numWeeks);
        int sum =0;
        for(int i=1; i<=num; i++) {
            sum += i;
        }
        return Integer.toString(sum) + "\n";
    } 

    public String printPriceChart(String productName, double price, int number) {
        int total = 0;
        System.out.println(productName);
        for(int i = 1; i <= number; i++) {
            if(i==1){
                total += (price*i);
                double dtotal = total;
                System.out.println(String.format(Integer.toString(i) + " - $" + "%,.2f", dtotal));
            } else {
                total += ((price*i)-.5);
                double dtotal = total;
                System.out.println(String.format(Integer.toString(i) + " - $" + "%,.2f", dtotal));
            }
        }
        return Integer.toString(total) + "\n";
    }

    public String getOrderTotal(double[] array) {
        double sum =0;
        for(Double val : array) {
            sum += val;
        }
        return String.format("$" + "%,.2f" + "\n", sum);
    }

    public String displayMenu(ArrayList<String> menu, ArrayList<Double> prices) {
        for(String item : menu) {
            System.out.println(String.format(menu.indexOf(item) + " " + item + " -- " + "$%,.2f", prices.get(menu.indexOf(item))));
        }
        return "\n";
    }

    public ArrayList<String> addCustomer(ArrayList<String> peeps) {
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        if(userName == "clear" || userName == "exit") {
            peeps = null;
            return peeps;
        }

        peeps.add(userName);
        String num = Integer.toString(peeps.size() -1);
        
        System.out.println("Hello " + userName);
        System.out.println("There\'s " + num + " people ahead of you.");
        return peeps;
    }

}
