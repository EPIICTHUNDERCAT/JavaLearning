package burgers.toppings;

public class Lettuce extends Toppings {
    public Lettuce(int toppingAmount) {
        super("lettuce", 0.50d, toppingAmount);
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
