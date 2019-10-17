package weapons;

import behaviours.IWeapon;

public class Batarang implements IWeapon {

    private int damagePoints;
    private String name;
    private String sound;

    public Batarang(){
        this.damagePoints = 10;
        this.name = "batarang";
        this.sound = "whoosh";
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
