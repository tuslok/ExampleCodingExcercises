package Room;

public class Room {
    private String typeOfRoom;
    private String owner;
    private boolean isDoorOpen;
    private Wardrobe wardrobe;
    private Desk desk;
    private Chair chair;
    private Bed bed;

    public Room(String typeOfRoom, String owner, boolean isDoorOpen, Wardrobe wardrobe, Desk desk, Chair chair, Bed bed) {
        this.typeOfRoom = typeOfRoom;
        this.owner = owner;
        this.isDoorOpen = isDoorOpen;
        this.wardrobe = wardrobe;
        this.desk = desk;
        this.chair = chair;
        this.bed = bed;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public String getOwner() {
        return owner;
    }

    public boolean isDoorOpen() {
        return isDoorOpen;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Desk getDesk() {
        return desk;
    }

    public Chair getChair() {
        return chair;
    }

    public Bed getBed() {
        return bed;
    }

    public void showOwner(String owner){
        desk.tableUp(120);
        bed.goSleep();
        openDoor(true);

    }

    private void openDoor(boolean isDoorOpen){
        if(isDoorOpen == false){
            System.out.println("Door is closed");
        } else {
            System.out.println("Door is opened");
        }
    }


}
