package weapons;

import behaviours.IWeapon;

public class Kick implements IWeapon {

    private int damagePoints;
    private String name;
    private String sound;

    public Kick(){
        this.damagePoints = 8;
        this.name = "kick combo ";
        this.sound = "boom boom bang";
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
