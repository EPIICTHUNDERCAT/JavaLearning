/*


 */

public class Car {
    //public means unrestricted access
    //private means no other class can access it
    //protected ----

    //Setters and Getters get created by Java when you implement the contents of a class(the below vars)

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;


    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {

            this.model = model;
        }else {
            this.model = "unknown";
        }
    }

    public String getModel() {
        return this.model;
    }

    public String getColour() {
        return colour;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }
}
