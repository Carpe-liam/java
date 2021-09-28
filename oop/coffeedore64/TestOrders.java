import java.util.*;

public class TestOrders {
    public static void main(String[] args) {

        CoffeeKiosk kiosk = new CoffeeKiosk();

        kiosk.addMenuItem("Drip", 1.5);
        kiosk.addMenuItem("Latte", 4.25);
        kiosk.addMenuItem("Mocha", 4.0);
        kiosk.addMenuItem("Puppiccino", 2.5);

        kiosk.addMenuItemInput();
        kiosk.newOrder();
    }
}
