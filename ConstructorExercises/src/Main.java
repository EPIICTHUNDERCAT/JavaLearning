public class Main {
    public static void main(String[] args) {
//
//        Wall wall1 = new Wall(4, 5);
//        Wall wall2 = new Wall(-10, -10);
//        wall1.getArea();
//        wall2.getArea();
//        System.out.println("width: " + wall1.getWidth());
//        System.out.println("width: " + wall2.getWidth());

        Wall errorWall = new Wall(1.125, -1.0);
        System.out.println(errorWall);

        System.out.println(errorWall.getArea());
        System.out.println(errorWall.getHeight());
        System.out.println("Width: " + errorWall.getWidth());
    }
}