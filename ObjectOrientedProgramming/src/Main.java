public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        car.Car("Mercedes", "E320", "Light Blue", 4, true);
        System.out.println("Get Doors? " + car.getDoors());
        car.setMake("Mercedes-BENZ");
        car.describeCar();
    }
}