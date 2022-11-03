package Encapsulation;

public class EnhancedPlayer {
    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        hitPoints = hitPoints - damage;
        if (hitPoints <= 0) {
            System.out.println("Player knocked out.");
            // Reduce number of lives ramaining for the player
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
