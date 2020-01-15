package srpfacadelab;


public class Facade {

    private Amour armour;
    private Inventory inventory;
    private Health health;
    
    public Facade(Armour armour, Inventory inventory, Health health) {
        this.armour = new Armour();
        this.inventory = new Inventory();
        this.health = new Health();
    }

    private Inventory getInventory() {
        return inventory;
    }

    private Health getHealth() {
        return health;
    }

    private Armour getArmour() {
        return armour;
    }

    private Inventory setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    private Health setHealth(Health health) {
        this.health = health;
    }

    private Armour setArmour(Armour armour) {
        this.armour = armour;
    }

}