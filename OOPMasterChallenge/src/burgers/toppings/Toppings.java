package burgers.toppings;

public class Toppings {
// Calculate topping price depoending on how many they request!


    private String topping;
    private double toppingPrice;
    private int toppingAmount;

    public Toppings(String topping, double toppingPrice, int toppingAmount) {
        this.topping = topping;
        this.toppingPrice = toppingPrice;
        this.toppingAmount = toppingAmount;
    }

    public double toppingsAmountPrice() {

        return this.toppingAmount * this.toppingPrice;

    }

    public String getTopping() {
        return topping;
    }

    public double getToppingPrice() {
        return toppingPrice;
    }

    public int getToppingAmount() {
        return toppingAmount;
    }
}

class Tomato extends Toppings {
    public Tomato(int toppingAmount) {
        super("tomato", 0.50d, toppingAmount);

    }

    @Override
    public double toppingsAmountPrice() {
        return this.getToppingAmount() * getToppingPrice();
    }

    @Override
    public String getTopping() {
        return super.getTopping();
    }
}

