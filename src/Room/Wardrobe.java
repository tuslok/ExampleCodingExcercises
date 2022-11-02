package Room;

public class Wardrobe {
    private String name;
    private String material;
    private boolean isMirror;
    private Shelf shelf;

    public Wardrobe(String name, String material, boolean isMirror, Shelf shelf) {
        this.name = name;
        this.material = material;
        this.isMirror = isMirror;
        this.shelf = shelf;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isMirror() {
        return isMirror;
    }

    public Shelf getShelf() {
        return shelf;
    }
}
