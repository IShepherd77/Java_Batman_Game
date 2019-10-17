package weapons;

import behaviours.IWeapon;

public class Punch implements IWeapon {

    private int damagePoints;
    private String name;
    private String sound;

    public Punch(){
        this.damagePoints = 5;
        this.name = "Punch Combo";
        this.sound = "biff biff pow";
    }

    public int attackPoints(){
        return this.damagePoints;
    }

    public String getName(){
        return this.name;
    }

    public String getSound(){
        return this.sound;
    }
}
