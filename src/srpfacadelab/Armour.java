package srpfacadelab;

public class Armour { 

    private RpgPlayer;
    
    public int getArmour() {
        return armour;
    }

    private void setArmour(int armour) {
        this.armour = armour;
    }

    private void calculateStats() {
        for (Item i: inventory) {
            armour += i.getArmour();
        }
    }

}