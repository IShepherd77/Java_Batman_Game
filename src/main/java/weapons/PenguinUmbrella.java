package weapons;

import behaviours.IWeapon;

public class PenguinUmbrella implements IWeapon {

    private int damagePoints;
    private String name;
    private String sound;

    public PenguinUmbrella(){
        this.damagePoints = 20;
        this.name = "Penguin UmbrellaGun";
        this.sound = "takk takk takkk takkkkkk";
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
