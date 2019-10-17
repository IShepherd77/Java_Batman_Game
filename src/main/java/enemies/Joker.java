package enemies;

import behaviours.IWeapon;
import weapons.JokerCane;

public class Joker extends Enemy {

    private IWeapon weapon;

    public Joker(){
        super(100);
        this.weapon = new JokerCane();
    }

    public void takeDamage(){
        int newHealthPoints = getHealthPoints() - 5;
        setHealthPoints(newHealthPoints);
    }

    public int attack(){
        return this.weapon.attackPoints();
    }
}
