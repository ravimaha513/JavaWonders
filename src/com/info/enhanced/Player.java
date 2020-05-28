package com.info.enhanced;


public class Player {

    private String name;
    private int health;
    private String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <=0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int healthRemaining() {

        return this.health;
    }
}
