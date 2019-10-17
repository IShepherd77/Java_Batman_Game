package enemies;

import behaviours.IHero;
import behaviours.IVillain;
import behaviours.IWeapon;
import weapons.JokerCane;

public class Joker extends Enemy implements IVillain {

    private IWeapon weapon;
    private String name;

    public Joker(){
        super(100);
        this.weapon = new JokerCane();
        this.name = "The Joker";
    }

    public void takeDamage(int damagePoints){
        int newHealthPoints = getHealthPoints() - damagePoints;
        setHealthPoints(newHealthPoints);
    }

    public String attack(IHero hero){
        int damagePoints = this.weapon.attackPoints();
        hero.takeDamage(damagePoints);
        String attackMsg = weapon.getSound().toUpperCase() + ", " + getName() + " has Attacked " + hero.getName() + " with " +
                weapon.getName()+ ". " + hero.getName() + " lost " +
                weapon.attackPoints() + " health points. " + hero.getName()
                + "'s remaining health points is " + hero.getHealthPoints() ;
        return attackMsg;
    }

    public String getName(){
        return this.name;
    }
}
