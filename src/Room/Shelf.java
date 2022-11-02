package Room;

public class Shelf {
    private String material;
    private int length;
    private int width;
    private int height;

    public Shelf(String material, int length, int width, int height) {
        this.material = material;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
