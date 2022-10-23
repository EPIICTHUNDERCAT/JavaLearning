import pc.*;

public class Main {
    public static void main(String[] args) {
        Dimensions dims = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Windows", "1000W",dims);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27,new Resolution(2540, 1440));
        Motherboard newMotherboard = new Motherboard(" BJ-200", "ASUS",4, 6, "v2.44");

        PC newPC = new PC(theCase, newMotherboard, theMonitor);
       newPC.powerUp();


    }
}