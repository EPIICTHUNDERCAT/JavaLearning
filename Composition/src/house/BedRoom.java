package house;

public class BedRoom {
    private String name;
    private String color;

    private int length;
    private int height;
    private int depth;

    public BedRoom(String name, String color, int length, int height, int depth) {
        this.name = name;
        this.color = color;
        this.length = length;
        this.height = height;
        this.depth = depth;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}
