import java.util.*;

public class Order {

//Member Variables
    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

// Constructors
    public Order() {
        this.name = "Guest";
        this.ready = false;
    }

    public Order(String name) {
        this.name = name;
        this.ready = false;
    }


// Getters (accessors)
    public String getName() {
        return this.name; 
    }

    public boolean getReady () {
        return this.ready;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

// Setters (mutators)
    public void setName(String name) {
        this.name = name;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public void setItemList(ArrayList<Item> items) {
        this.items = items;
    }

// Order Methods
    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage () {
        if(this.ready == true) {
            return this.name + ", " + "Your order is ready.";
        } else {
            return this.name + ", " + "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal () {
        double total =0.0;
        for(Item curr : this.items) {
            total += curr.getPrice();
        }
        return total;
    }

    public void display () {
        System.out.println("-----------------------------");
        System.out.printf("Customer Name: %s \n", this.name );
        for(Item curr : this.items) {
            System.out.printf("%s - $ %,.2f \n", curr.getName(), curr.getPrice());
        }
        System.out.printf("Total: $ %,.2f \n", this.getOrderTotal());
    }
}