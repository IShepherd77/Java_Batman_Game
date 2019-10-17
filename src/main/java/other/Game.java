package other;

import behaviours.IHero;
import behaviours.IVillain;

public class Game {

    private IHero hero;
    private IVillain villain;
    private Arena arena;

    public Game(IHero hero, IVillain villain, Arena arena){
        this.hero = hero;
        this.villain = villain;
        this.arena = arena;

    }

    public String startGame(){
        return hero.getName() + " met " + villain.getName() +
                " in " + arena.getArenaName() + " and they will FIGHT !!!!! (cheers for batman)";
    }

    public String heroAttackVillain(){
        if (villain.getHealthPoints() > 0) {
            return hero.attack(villain);
        } else {
            return hero.getName() + " Wins , WOOOP WOOOOP" ;
        }
    }

    public String villainAttackhero(){
        if (hero.getHealthPoints() > 0) {
            return villain.attack(hero);
        } else {
            return villain.getName() + " wins , boooo";
        }


    }


}
