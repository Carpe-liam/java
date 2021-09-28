import java.util.*;

public class TestOrders {
    public static void main(String[] args) {

        // Menu items
    // instantiate menu items
        Item item1 = new Item("Drip", 1.5);
        Item item2 = new Item("Latte", 4.25);
        Item item3 = new Item("Mocha", 4.0);
        Item item4 = new Item("Puppiccino", 2.5);
    // set name & price

        // Order variables -- order1, order2 etc.
    // instantiate orders
        Order order1 = new Order();
        Order order2= new Order();
        //specificied
        Order order3 = new Order("Butters");
        Order order4 = new Order("Kouvre");
        Order order5 = new Order("Eevee");
    // modify orders
        order1.addItem(item2);
        order1.addItem(item4);

    System.out.println(order1.getStatusMessage());

        order1.setReady(true);
    System.out.println(order1.getStatusMessage());
    System.out.println("Total is: " + order1.getOrderTotal());

        order3.addItem(item3);
        order2.addItem(item1);
        order4.addItem(item2);
        order5.addItem(item4);
        order5.addItem(item1);

        order5.display();
    }
}
