package vehicles;

public class BMW extends Car {
    private int roadService;


    public BMW(int roadServiceMonths) {
        super("M3", "TWD", 4, 4, 6, false);

        this.roadService = roadServiceMonths;
    }


    public void accelerate(int rate) {

        int newVelocity = getCurrentVelocity() + rate;

        if (newVelocity == 0) {
            stop();
            changeGear(1);

        } else if (newVelocity > 0 && newVelocity <= 10) {

            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {

            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {

            changeGear(3);
        } else if (newVelocity > 30 && newVelocity <= 40) {

            changeGear(4);
        }

        if (newVelocity > 0) {
            changeVel(newVelocity, getCurrentVelocity());
        }
    }
}
