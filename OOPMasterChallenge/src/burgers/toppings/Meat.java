package burgers.toppings;

public class Meat {

    private String meatType;
    private double price;


    public Meat(String meatType, double price) {
        this.meatType = meatType;
        this.price = price;
    }


    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

