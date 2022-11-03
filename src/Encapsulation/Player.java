package Encapsulation;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        health = health - damage;
        if(health <= 0){
            System.out.println("Player knocked out.");
            // Reduce number of lives ramaining for the player
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
