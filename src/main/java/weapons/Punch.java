package weapons;

import behaviours.IWeapon;

public class Punch implements IWeapon {

    private int damagePoints;

    public Punch(){
        this.damagePoints = 5;
    }

    public int attackPoints(){
        return this.damagePoints;
    }
}
