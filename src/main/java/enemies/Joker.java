package enemies;

import behaviours.IHero;
import behaviours.IVillain;
import behaviours.IWeapon;
import weapons.JokerCane;

public class Joker extends Enemy implements IVillain {

    private IWeapon weapon;

    public Joker(){
        super(100);
        this.weapon = new JokerCane();
    }

    public void takeDamage(int damagePoints){
        int newHealthPoints = getHealthPoints() - damagePoints;
        setHealthPoints(newHealthPoints);
    }

    public void attack(IHero hero){
        int damagePoints = this.weapon.attackPoints();
        hero.takeDamage(damagePoints);
    }
}
