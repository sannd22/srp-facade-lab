package srpfacadelab;

import java.util.List;
import java.util.ArrayList;


public class RpgPlayer {
    
    private final IGameEngine gameEngine;

    private int carryingCapacity;

    public static final int MAX_CARRYING_CAPACITY = 1000;

    private List<Item> inventory;

    private int health;

    private int maxHealth;

    private int armour;

    public RpgPlayer(IGameEngine gameEngine) {
        this.gameEngine = gameEngine;
        this.inventory = new ArrayList<Item>();
        carryingCapacity = MAX_CARRYING_CAPACITY;
    }

    public void useItem(Item item) {
        if (item.getName().equals("Stink Bomb"))
        {
            List<IEnemy> enemies = gameEngine.getEnemiesNear(this);

            for (IEnemy enemy: enemies){
                enemy.takeDamage(100);
            }
        }
    }
}
