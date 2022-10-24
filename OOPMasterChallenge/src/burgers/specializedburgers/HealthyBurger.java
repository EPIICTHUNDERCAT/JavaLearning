package burgers.specializedburgers;

import burgers.BaseBurger;
import burgers.toppings.Meat;
import burgers.toppings.RegularRoll;
import burgers.toppings.Toppings;

public class HealthyBurger extends BaseBurger {


    public HealthyBurger(Meat meat, RegularRoll roll, Toppings toppings) {
        super(meat, roll, toppings, 3.50);
    }

    public HealthyBurger(Meat meat, RegularRoll roll, Toppings toppings, Toppings toppings1, Toppings toppings2) {
        super(meat, roll, toppings, toppings1, toppings2, 3.50);
    }

    public HealthyBurger(Meat meat, RegularRoll roll, Toppings toppings, Toppings toppings1, Toppings toppings2, Toppings toppings3) {
        super(meat, roll, toppings, toppings1, toppings2, toppings3, 3.50);
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
        return this.getBasePrice() + this.getMeat().getPrice() + this.getRoll().getRollPrice() + this.getToppings().getToppingPrice() + this.getToppings().getToppingPrice() + this.getToppings().getToppingPrice() + this.getToppings().getToppingPrice();
    }
}
