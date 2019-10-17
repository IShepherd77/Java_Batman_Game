import enemies.Penguin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PenguinTest {

    Penguin penguin;

    @Before
    public void before(){
        penguin = new Penguin();
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(75, penguin.getHealthPoints());
    }

    @Test
    public void hasDamageAffect(){
        penguin.takeDamage();
        assertEquals(70, penguin.getHealthPoints());
    }

    @Test
    public void hasAttackAffect(){
        assertEquals(20, penguin.attack());
    }
}
