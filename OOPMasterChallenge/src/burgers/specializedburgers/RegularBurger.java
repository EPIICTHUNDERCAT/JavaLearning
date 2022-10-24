package burgers.specializedburgers;

import burgers.BaseBurger;
import burgers.toppings.Meat;
import burgers.toppings.RegularRoll;
import burgers.toppings.Toppings;

public class RegularBurger extends BaseBurger {


    public RegularBurger(Meat meat, RegularRoll roll, Toppings toppings) {
        super(meat, roll, toppings, 2.50d);
    }

    @Override
    public double calculateTotalPriceReg() {


        return this.getBasePrice() + this.getMeat().getPrice() + this.getRoll().getRollPrice() + this.getToppings().getToppingPrice();


    }

    @Override
    public double calculateTotalPriceAddedToppings() {
        return super.calculateTotalPriceAddedToppings();
    }

    @Override
    public double calculateTotalPriceAddedToppingsMore() {
        return super.calculateTotalPriceAddedToppingsMore();
    }
}
