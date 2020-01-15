package srpfacadelab;


public class Health { 

    private RpgPlayer;
    
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        maxHealth = maxHealth;
    }

    public void takeDamage(int damage) {
        if (damage < armour) {
            gameEngine.playSpecialEffect("parry");
        }

        int damageToDeal = damage - armour;
        
        if ( (calculateInventoryWeight()*2) < getCarryingCapacity()) {
            health -= damageToDeal * 0.75;
        } else {
            health -= damageToDeal;
        }
        gameEngine.playSpecialEffect("lots_of_gore");
    }
}