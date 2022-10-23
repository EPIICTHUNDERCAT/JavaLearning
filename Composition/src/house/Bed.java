package house;

public class Bed {


    private String matressName;
    private boolean hasBedFrame;
    private int length;
    private int height;
    private int depth;


    public Bed(String matressName, boolean hasBedFrame, int length, int height, int depth) {
        this.matressName = matressName;
        this.hasBedFrame = hasBedFrame;
        this.length = length;
        this.height = height;
        this.depth = depth;
    }

    public String getMatressName() {
        return matressName;
    }

    public boolean isHasBedFrame() {
        return hasBedFrame;
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
