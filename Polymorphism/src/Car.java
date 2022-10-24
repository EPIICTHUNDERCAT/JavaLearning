public class Car {


    private boolean engine;
    private int wheels;
    private int cylinders;
    private String model;
    private int door;


    public Car(int cylinders, String model) {
        this.door = 4;
        this.wheels = 4;
        this.engine = true;
        this.cylinders = cylinders;
        this.model = model;
    }


    public void startEngine() {
        System.out.println("The CAR - > Engine has Started.");

    }

    public void accelerate() {
        System.out.println("CAR - > Acceleration state is 10mph");

    }

    public void brake() {
        System.out.println("CAR - > Breaking initiated");
    }


}

class Mercedez extends Car {
    public Mercedez(int cylinders, String model) {
        super(cylinders, model);
    }

    @Override
    public void startEngine() {
        System.out.println("ENGINE STARTED ... *noises*");
    }

    @Override
    public void accelerate() {
        System.out.println("Mercedez Acceleration Increased by 3...");
    }

    @Override
    public void brake() {
        System.out.println("Mercedez brake start... Brake SQUEAKED!");
    }
}

class BMW extends Car {

    public BMW(int cylinders, String model) {
        super(cylinders, model);
    }

    @Override
    public void startEngine() {
        System.out.println("ENGINE STARTED ... ROAR");
    }

    @Override
    public void accelerate() {
        System.out.println("BMW Acceleration Increased by 30!!");
    }

    @Override
    public void brake() {
        System.out.println("BMW brake start... Brake Hyper initialized!");
    }
}

class Toyota extends Car {
    public Toyota(int cylinders, String model) {
        super(cylinders, model);
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void brake() {
        System.out.println("Toyota brake start... Failed!");
    }
}

class Honda extends Car {
    public Honda(int cylinders, String model) {
        super(cylinders, model);
    }

    @Override
    public void startEngine() {
        System.out.println("Honda Keyless start... Started!");
    }

    @Override
    public void accelerate() {
        System.out.println("Acceleration increased by 12!");
    }

    @Override
    public void brake() {
        System.out.println("braking started .... acceleration is 0!");
    }
}

class Ford extends Car {
    public Ford(int cylinders, String model) {
        super(cylinders, model);
    }

    @Override
    public void startEngine() {
        System.out.println("Ford Engine has stalled!");
    }

    @Override
    public void accelerate() {
        System.out.println("Acceleration Speed is 5mph");
    }

    @Override
    public void brake() {
        System.out.println("braking failed!");
    }
}