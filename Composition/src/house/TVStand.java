package house;

public class TVStand {

    private int length;
    private int height;
    private int depth;
    private String tvType;

    public TVStand(int length, int height, int depth, String tvType) {
        this.length = length;
        this.height = height;
        this.depth = depth;
        this.tvType = tvType;
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

    public String getTvType() {
        return tvType;
    }
}
