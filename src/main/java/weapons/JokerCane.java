package weapons;

import behaviours.IWeapon;

public class JokerCane implements IWeapon {

    private int damagePoints;
    public JokerCane(){
        this.damagePoints = 15;
    }



    public int attackPoints() {
        return this.damagePoints;
    }
}
