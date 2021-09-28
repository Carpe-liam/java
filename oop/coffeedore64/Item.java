public class Item {
    private String name;
    private double price;
    private int index;

// Constructors
    public Item() {}

    public Item(String name, double price) {
        this.name = name; 
        this.price = price;
        index++;
    }

// Getters
    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getIndex() {
        return this.index;
    }

// Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIndex(int indexParam) {
        index = indexParam;
    }
}