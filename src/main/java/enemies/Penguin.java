package enemies;

import behaviours.IWeapon;
import weapons.PenguinUmbrella;

public class Penguin extends Enemy{

    private IWeapon weapon;


    public Penguin(){
        super(75);
        this.weapon = new PenguinUmbrella();
    }

    public void takeDamage(){
        int newHealthPoints = getHealthPoints() -5;
        setHealthPoints(newHealthPoints);
    }

    public int attack(){
        return this.weapon.attackPoints();
    }


}
