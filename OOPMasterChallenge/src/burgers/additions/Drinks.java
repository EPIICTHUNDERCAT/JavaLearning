package burgers.additions;

public class Drinks {

    private double price;
    private String name;

    public Drinks(String name) {
        this.price = 0.50;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
