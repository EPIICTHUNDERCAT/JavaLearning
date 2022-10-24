public class Main {
    public static void main(String[] args) {
        Car car = new Car(10, "BaseCar");
        car.startEngine();
        car.accelerate();
        car.brake();

        Mercedez mercedez = new Mercedez(10, "Mercedez");

        mercedez.accelerate();
        mercedez.brake();
        mercedez.startEngine();

        Ford ford = new Ford(10, "Mercedez");

        ford.accelerate();
        ford.brake();
        ford.startEngine();

        //Why is a class static if its inside the class
    }
}