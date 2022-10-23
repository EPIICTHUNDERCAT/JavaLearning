public class Main {


    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 1, 12);

        Dog dog = new Dog("Cocker Spaniel", 1, 40, 2, 4, 1, 12, "Long Silky");

        dog.eat();
        dog.run();
        dog.walk();
    }


}