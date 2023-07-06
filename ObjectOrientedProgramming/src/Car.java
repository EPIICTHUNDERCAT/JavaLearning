public class Car {

    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public void Car(String make, String model, String color, int doors, boolean convertible) {

        this.make = make;
        this.model = model;
        this.color = color;
        this.doors = doors;
        this.convertible = convertible;

    }

    public void describeCar() {
        System.out.println(doors + "-Door " + color + " " + make + " " + model + " " + (convertible ? "Convertible" : ""));
    }

    public int getDoors() {
        return this.doors;
    }

    public String getMake() {
        return this.make;
    }

    public String getColor() {
        return this.color;

    }

    public boolean isConvertible() {
        return this.convertible;
    }

    public String getModel() {
        return this.model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
}
