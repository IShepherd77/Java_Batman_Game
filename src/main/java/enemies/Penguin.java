package enemies;

import behaviours.IHero;
import behaviours.IVillain;
import behaviours.IWeapon;
import weapons.PenguinUmbrella;

public class Penguin extends Enemy implements IVillain {

    private IWeapon weapon;
    private String name;


    public Penguin(){
        super(75);
        this.weapon = new PenguinUmbrella();
        this.name = "The Penguin";
    }

    public void takeDamage(int damagePoints){
        int newHealthPoints = getHealthPoints() - damagePoints;
        setHealthPoints(newHealthPoints);
    }

    public String attack(IHero hero){
        int damagePoints = this.weapon.attackPoints();
        hero.takeDamage(damagePoints);
        String attackMsg = weapon.getSound() + " " + getName() + " has Attacked " + hero.getName() + " with " +
                weapon.getName()+ " " + hero.getName() + " lost " +
                weapon.attackPoints() + " health points " + hero.getName()
                + " the remaining health points is " + hero.getHealthPoints() ;
        return attackMsg;
    }

    public String getName(){
        return this.name;
    }
}


