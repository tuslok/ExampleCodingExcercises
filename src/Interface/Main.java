package Interface;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Player player = new Player("Mark", 45, 99);
        Player player1 = new Player("Angel", 5, 91);
        player.write();
        player.read(list);
    }

}
