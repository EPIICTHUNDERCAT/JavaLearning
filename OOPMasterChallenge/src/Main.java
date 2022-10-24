import burgers.additions.Chips;
import burgers.additions.Drinks;
import burgers.specializedburgers.DeluxeBurger;
import burgers.specializedburgers.HealthyBurger;
import burgers.toppings.*;

public class Main {
    public static void main(String[] args) {

        DeluxeBurger deluxeBurger = new DeluxeBurger(new Chicken(), new WhiteBreadRoll(), new Pickles(4), new Chips("Doritos"), new Drinks("coke"));
        System.out.println(deluxeBurger.calculateTotalPriceReg());


        HealthyBurger healthyBurger = new HealthyBurger(new Beef(), new WhiteBreadRoll(), new Pickles(4));
        System.out.println(healthyBurger.calculateTotalPriceReg());

        HealthyBurger healthyBurger2 = new HealthyBurger(new Beef(), new WhiteBreadRoll(), new Pickles(4), new Egg(4), new Lettuce(2));
        System.out.println(healthyBurger2.calculateTotalPriceAddedToppingsMore());


    }

}