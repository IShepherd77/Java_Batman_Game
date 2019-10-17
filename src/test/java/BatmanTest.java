import heroes.Batman;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BatmanTest {

    Batman batman;

    @Before
    public void before(){
        batman = new Batman();
    }

    @Test
    public void hasName(){
        assertEquals("Bruce Wayne", batman.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(200, batman.getHealthPoints());
    }

    @Test
    public void hasWeapons(){
        batman.addWeapons();
        assertEquals(3, batman.getWeaponsCount());
    }

    @Test
    public void hasAttackEffect(){
        assertEquals(8, batman.attack(), 3);
    }
}
