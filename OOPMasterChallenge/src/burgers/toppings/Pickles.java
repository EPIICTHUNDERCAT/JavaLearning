package burgers.toppings;

public class Pickles extends Toppings {
    public Pickles(int toppingAmount) {
        super("Pickles", 0.50d, toppingAmount);
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
