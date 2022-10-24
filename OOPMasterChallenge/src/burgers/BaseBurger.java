package burgers;

import burgers.toppings.Meat;
import burgers.toppings.RegularRoll;
import burgers.toppings.Toppings;

public class BaseBurger {

    private Meat meat;
    private RegularRoll roll;

    private Toppings toppings;
    private Toppings toppings1;
    private Toppings toppings2;
    private Toppings toppings3;
    //  private boolean isHealthy;
    private double basePrice = 3.50d;

    public BaseBurger(Meat meat, RegularRoll roll, Toppings toppings, double basePrice) {

        this.meat = meat;
        this.roll = roll;
        this.toppings = toppings;
        this.basePrice = basePrice;
    }

    public BaseBurger(Meat meat, RegularRoll roll, Toppings toppings, Toppings toppings1, Toppings toppings2, double basePrice) {
        this.meat = meat;
        this.roll = roll;
        this.toppings = toppings;
        this.toppings1 = toppings1;
        this.toppings2 = toppings2;
        this.basePrice = basePrice;
    }

    public BaseBurger(Meat meat, RegularRoll roll, Toppings toppings, Toppings toppings1, Toppings toppings2, Toppings toppings3, double basePrice) {

        this.meat = meat;
        this.roll = roll;
        this.toppings = toppings;
        this.basePrice += basePrice;
        this.toppings1 = toppings1;
        this.toppings2 = toppings2;
        this.toppings3 = toppings3;
    }


    public double calculateTotalPriceReg() {

        return this.basePrice + this.toppings.getToppingPrice() + this.roll.getRollPrice() + this.meat.getPrice();

    }

    public double calculateTotalPriceAddedToppings() {

        return this.basePrice + this.toppings.getToppingPrice() + this.toppings1.getToppingPrice() + this.toppings2.getToppingPrice() + this.roll.getRollPrice() + this.meat.getPrice();

    }

    public double calculateTotalPriceAddedToppingsMore() {

        return this.basePrice + this.toppings.getToppingPrice() + this.toppings1.getToppingPrice() + this.toppings2.getToppingPrice() + this.toppings3.getToppingPrice() + this.roll.getRollPrice() + this.meat.getPrice();

    }


    public Meat getMeat() {
        return meat;
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    public RegularRoll getRoll() {
        return roll;
    }

    public void setRoll(RegularRoll roll) {
        this.roll = roll;
    }

    public Toppings getToppings() {
        return toppings;
    }

    public void setToppings(Toppings toppings) {
        this.toppings = toppings;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
