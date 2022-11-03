package Encapsulation;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Mark";
        player.health = 20;
        player.weapon = "Knife";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tim", 600, "Sword");
        System.out.println("Initial health is " + enhancedPlayer.getHealth());
    }

}
