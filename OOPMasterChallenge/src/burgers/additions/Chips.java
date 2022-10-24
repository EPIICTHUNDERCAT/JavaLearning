package burgers.additions;

public class Chips {

    private double price;
    private String name;

    public Chips(String name) {
        this.price = 1.00;
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
