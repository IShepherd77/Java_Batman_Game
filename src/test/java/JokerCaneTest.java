import org.junit.Before;
import org.junit.Test;
import weapons.JokerCane;

import static org.junit.Assert.assertEquals;

public class JokerCaneTest {

    JokerCane jokercane;

    @Before
    public void before(){
        jokercane = new JokerCane();
    }

    @Test
      public void hasDamagePoints(){
        assertEquals(15, jokercane.attack());
    }
}
