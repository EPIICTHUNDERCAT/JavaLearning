package burgers.toppings;

public class RegularRoll {
    private double rollPrice = 1.00d;
    private String rollName;

    public RegularRoll(double price, String rollName) {
        this.rollPrice += price;
        this.rollName = rollName;
    }

    public double getRollPrice() {
        return rollPrice;
    }

    public void setRollPrice(double rollPrice) {
        this.rollPrice = rollPrice;
    }

    public String getRollName() {
        return rollName;
    }

    public void setRollName(String rollName) {
        this.rollName = rollName;
    }
}
