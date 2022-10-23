public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tails;
    private int teeth;
    private String coat;


    public Dog(String name, int size, int weight, int eyes, int legs, int tails, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tails = tails;
        this.teeth = teeth;
        this.coat = coat;
    }


    @Override
    public void eat() {

        chew();

        super.eat();

    }

    private void chew() {
        System.out.println("Dog is Chewing!!");

    }

    public void run() {

        move(40);

    }

    public void walk() {
        move(10);
    }
}
