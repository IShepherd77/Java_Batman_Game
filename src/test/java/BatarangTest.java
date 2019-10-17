import org.junit.Before;
import org.junit.Test;
import weapons.Batarang;

import static org.junit.Assert.assertEquals;

public class BatarangTest {

    Batarang batarang;

    @Before
    public void before(){
        batarang = new Batarang();
    }

    @Test
    public void hasDamagePoints(){
        assertEquals(10, batarang.attackPoints());
    }
}
