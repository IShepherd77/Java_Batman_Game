import enemies.Joker;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JokerTest {

    Joker joker;

    @Before
    public void before(){
        joker = new Joker();
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, joker.getHealthPoints());
    }

    @Test
    public void hasDamageAffect(){
        joker.takeDamage();
        assertEquals(95, joker.getHealthPoints());
    }

}
