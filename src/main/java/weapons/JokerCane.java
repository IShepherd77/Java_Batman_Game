package weapons;

import behaviours.IWeapon;

public class JokerCane implements IWeapon {

    private int damagePoints;
    private String name;
    private String sound;

    public JokerCane(){
        this.damagePoints = 15;
        this.name = "JokerCane";
        this.sound = "tsssssmack";
    }

    public int attackPoints() {
        return this.damagePoints;
    }

    public String getName(){
        return this.name;
    }

    public String getSound(){
        return this.sound;
    }
}
