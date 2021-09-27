import java.util.*;

public class TestOrders {
    public static void main(String[] args) {

        // Menu items
    // instantiate 4 menu items
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();
    // set name & price
        // item 1
        item1.name = "Americano";
        item1.price = 1.5;
        // item 2
        item2.name = "Puppaccino"; 
        item2.price = 2.5;
        // item 3
        item3.name = "Frappe";
        item3.price = 4.0;
        // item 4
        item4.name = "Cappuccino";
        item4.price = 5.25;

        // Order variables -- order1, order2 etc.
    // instantiate 4 orders
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();
    //set order names
        // order 1
        order1.name = "Cindhuiri";
        // order 2
        order2.name = "Jimmy";
        // order 3
        order3.name = "Noah";
        // order 4
        order4.name = "Sam";
    // modify orders
        // order 1
        order1.items.add(item4);
        order1.items.add(item2);
        order1.total += item4.price;
        order1.total += item2.price;
        //order 2
        order2.items.add(item1);
        order2.total += item1.price;
        // order 3
        order3.items.add(item4);
        order3.total += item4.price;
        // order 4
        order4.items.add(item2);
        order4.total += item2.price;
        // order 1
        order1.ready = true; 
        // order 4
        order4.items.add(item1);
        order4.items.add(item1);
        order4.total += (item1.price *2);
        // order 2
        order2.ready = true;


        // Application Simulations
        // Use this example code to test various orders' updates
    System.out.println("------------------------------");
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

    System.out.println("------------------------------");
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

    System.out.println("------------------------------");
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);

    System.out.println("------------------------------");
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);

    System.out.println("------------------------------");
    }
}
