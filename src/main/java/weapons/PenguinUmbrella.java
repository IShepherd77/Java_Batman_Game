package weapons;

import behaviours.IWeapon;

public class PenguinUmbrella implements IWeapon {

    private int damagePoints;

    public PenguinUmbrella(){
        this.damagePoints = 20;
    }

    public int attack(){
        return this.damagePoints;
    }


}
