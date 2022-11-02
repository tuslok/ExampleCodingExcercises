package Room;

public class Chair {

    private String manufacturer;
    private String type;
    private int legs;

    public Chair(String manufacturer, String type, int legs) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.legs = legs;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getType() {
        return type;
    }

    public int getLegs() {
        return legs;
    }

    public void sit(){
        System.out.println("Sitting on " + type + " chair with " + legs + " legs. I really recommend chair from " + manufacturer);
    }
}
