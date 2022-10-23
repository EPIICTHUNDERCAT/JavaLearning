package vehicles;

public class Vehicles {

    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;


    public Vehicles(String name, String size, int currentVelocity, int currentDirection) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public Vehicles(String name, String size) {

    }

    public void steer(int direction) {
        this.currentDirection += direction;

        System.out.println(direction);

    }


    public void stop() {
        this.currentVelocity = 0;
    }
    public void move(int vel, int dir) {
        this.currentDirection = dir;

        this.currentVelocity = vel;

        System.out.println(currentDirection + currentDirection);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }


}
