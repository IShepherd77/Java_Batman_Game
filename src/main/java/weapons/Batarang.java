package weapons;

import behaviours.IWeapon;

public class Batarang implements IWeapon {

    private int damagePoints;
    private String name;

    public Batarang(){
        this.damagePoints = 10;
        this.name = "batarang";
    }

    public int attackPoints(){
        return this.damagePoints;
    }

    public String getName(){
        return this.name;
    }
}
