package burgers.specializedburgers;

import burgers.BaseBurger;
import burgers.additions.Chips;
import burgers.additions.Drinks;
import burgers.toppings.Meat;
import burgers.toppings.RegularRoll;
import burgers.toppings.Toppings;

public class DeluxeBurger extends BaseBurger {

    private Chips chip;
    private Drinks drink;


    public DeluxeBurger(Meat meat, RegularRoll roll, Toppings toppings, Chips chip, Drinks drink) {
        super(meat, roll, toppings, 4.50d);
        this.chip = chip;
        this.drink = drink;

    }

    @Override
    public double calculateTotalPriceReg() {


        return this.getBasePrice() + this.getMeat().getPrice() + this.getRoll().getRollPrice() + this.getToppings().getToppingPrice() + this.getChip().getPrice() + this.getDrink().getPrice();


    }

    public Chips getChip() {
        return chip;
    }

    public void setChip(Chips chip) {
        this.chip = chip;
    }

    public Drinks getDrink() {
        return drink;
    }

    public void setDrink(Drinks drink) {
        this.drink = drink;
    }
}
