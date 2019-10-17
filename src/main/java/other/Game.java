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

    public String heroAttackVillian(){
        return hero.attack(villain);
    }


}
