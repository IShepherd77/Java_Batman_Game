package heroes;

import behaviours.IWeapon;
import weapons.Batarang;

import java.util.ArrayList;
import java.util.Random;

public class Batman extends Player{

    private ArrayList<IWeapon> weapons;
    private Batarang batarang;

    public Batman(){
        super("Bruce Wayne", 200);
        this.weapons = new ArrayList<IWeapon>();
    }

    public void addWeapons(){
        this.weapons.add(batarang);
    }

    public int attack(String weaponName){
        Random random = new Random();
        IWeapon attackingWeapon = this.weapons.get(random.nextInt(weapons.size()));
        return attackingWeapon.attackPoints();
    }


}
