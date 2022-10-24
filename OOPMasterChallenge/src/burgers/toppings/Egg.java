package burgers.toppings;

public class Egg extends Toppings {
    public Egg(int toppingAmount) {
        super("Egg", 1.50d, toppingAmount);
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
