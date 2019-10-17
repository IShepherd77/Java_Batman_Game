package heroes;

import behaviours.IWeapon;
import weapons.Batarang;
import weapons.Kick;
import weapons.Punch;

import java.util.ArrayList;
import java.util.Random;

public class Batman extends Player{

    private ArrayList<IWeapon> weapons;
    private Batarang batarang = new Batarang();
    private Kick kick = new Kick();
    private Punch punch = new Punch();

    public Batman(){
        super("Bruce Wayne", 200);
        this.weapons = new ArrayList<IWeapon>();
    }

    public void addWeapons(){
        this.weapons.add(batarang);
        this.weapons.add(kick);
        this.weapons.add(punch);
    }

    public int attack(){
        addWeapons();
        Random random = new Random();
        IWeapon attackingWeapon = this.weapons.get(random.nextInt(weapons.size()));
        return attackingWeapon.attackPoints();
    }

    public int getWeaponsCount(){
        return this.weapons.size();
    }

}
