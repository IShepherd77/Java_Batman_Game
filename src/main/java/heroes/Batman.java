package heroes;

import behaviours.IHero;
import behaviours.IVillain;
import behaviours.IWeapon;
import weapons.Batarang;
import weapons.Kick;
import weapons.Punch;

import java.util.ArrayList;
import java.util.Random;

public class Batman extends Player implements IHero {

    private ArrayList<IWeapon> weapons;
    private Batarang batarang = new Batarang();
    private Kick kick = new Kick();
    private Punch punch = new Punch();

    public Batman(){
        super("Bat Man", 200);
        this.weapons = new ArrayList<IWeapon>();
    }

    public void addWeapons(){
        this.weapons.add(batarang);
        this.weapons.add(kick);
        this.weapons.add(punch);
    }

    public String attack(IVillain enemy){
        addWeapons();
        Random random = new Random();
        IWeapon attackingWeapon = this.weapons.get(random.nextInt(weapons.size()));
        int damagePoints = attackingWeapon.attackPoints();
        enemy.takeDamage(damagePoints);
        String attackMsg = attackingWeapon.getSound() + " " + getName() + " has Attacked " + enemy.getName() + " with " +
                attackingWeapon.getName()+ " " + enemy.getName() + " lost " +
                attackingWeapon.attackPoints() + " health points " + enemy.getName()
                + " the remaining health points is " + enemy.getHealthPoints() ;
        return attackMsg;
    }

    public void takeDamage(int damagePoints){
        int newHealthPoints = getHealthPoints() - damagePoints;
        setHealthPoints(newHealthPoints);
    }

    public int getWeaponsCount(){
        return this.weapons.size();
    }

}
