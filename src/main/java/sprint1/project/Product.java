package sprint1.project;

public class Product {
    protected int id;
    protected String name;
    protected double Price;
    protected int Count;

    public Product(int id, String name, double price, int count) {
        this.id = id;
        this.name = name;
        Price = price;
        Count = count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return Price;
    }

    public int getCount() {
        return Count;
    }
}
