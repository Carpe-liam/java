public class CafeUtil {


    public String getStreakGoal() {
        int num = 10;
        int sum =0;
        for(int i=1; i<=num; i++) {
            sum += i;
        }
        return Integer.toString(sum);
    } 

    public String getStreakGoal(String numWeeks) {
        int num = Integer.parseInt(numWeeks);
        int sum =0;
        for(int i=1; i<=num; i++) {
            sum += i;
        }
        return Integer.toString(sum);
    } 

    public String printPriceChart(String productName, double price, int number) {
        System.out.println(productName);
        for(int i = 1; i <= number; i++) {
            System.out.println(String.format(Integer.toString(i) + " - $" + "%,.2f", (price * i)));
        }
        return "";
    }









}
