import vehicles.BMW;

public class Main {
    public static void main(String[] args) {
        BMW m3 = new BMW(10);
m3.steer(5);
        m3.accelerate(30);
        m3.accelerate(- 340);
    }
}