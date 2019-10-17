package weapons;

import behaviours.IWeapon;

public class Kick implements IWeapon {

    private int damagePoints;

    public Kick(){
        this.damagePoints = 8;
    }

    public int attackPoints(){
        return this.damagePoints;
    }
}
