package enemies;

import behaviours.IVillain;
import behaviours.IWeapon;
import weapons.PenguinUmbrella;

public class Penguin extends Enemy implements IVillain {

    private IWeapon weapon;


    public Penguin(){
        super(75);
        this.weapon = new PenguinUmbrella();
    }

    public void takeDamage(int damagePoints){
        int newHealthPoints = getHealthPoints() - damagePoints;
        setHealthPoints(newHealthPoints);
    }

    public int attack(){
        return this.weapon.attackPoints();
    }


}
