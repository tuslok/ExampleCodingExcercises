package Room;

public class House {

    public static void main(String[] args) {
        Shelf deskShelf = new Shelf("Wood", 80, 3, 20);

        Desk desk = new Desk("Deskius X1", 90, 70, 150, deskShelf);
        Wardrobe wardrobe = new Wardrobe("Moolfi", "50% wood, 50% steal", true, new Shelf("Wood", 130, 5, 90));
        Chair chair = new Chair("Woodlandia", "office", 5);
        Bed bed = new Bed(3, "Red with Santa Claus");
        Room mikeRoom = new Room("Private room", "Mike", false, wardrobe, desk, chair, bed);
        mikeRoom.getDesk().openShelf(6);
        mikeRoom.showOwner("Mike");


    }

}
