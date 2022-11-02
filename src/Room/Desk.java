package Room;

public class Desk {

    private String name;
    private int height;
    private int width;
    private int length;
    private Shelf shelf;

    public Desk(String name, int height, int width, int length, Shelf shelf) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.length = length;
        this.shelf = shelf;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public Shelf getShelf() {
        return shelf;
    }

    public void tableUp(int height){
        System.out.println("Table up at " + height + " cm.");
    }

    public void openShelf(int shelf){
        System.out.println("Open shelf number " + shelf);
    }
}
