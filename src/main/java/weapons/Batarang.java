package weapons;

import behaviours.IWeapon;

public class Batarang implements IWeapon {

    private int damagePoints;

    public Batarang(){
        this.damagePoints = 10;
    }

    public int attackPoints(){
        return this.damagePoints;
    }

}
