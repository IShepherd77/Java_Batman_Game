import behaviours.IHero;
import enemies.Penguin;
import heroes.Batman;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PenguinTest {

    Penguin penguin;
    IHero batman;

    @Before
    public void before(){
        penguin = new Penguin();
        batman = new Batman();
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(75, penguin.getHealthPoints());
    }

    @Test
    public void hasDamageAffect(){
        penguin.takeDamage(5);
        assertEquals(70, penguin.getHealthPoints());
    }

    @Test
    public void hasAttackAffect(){
        penguin.attack(batman);
        assertEquals(180, batman.getHealthPoints());
    }
}
