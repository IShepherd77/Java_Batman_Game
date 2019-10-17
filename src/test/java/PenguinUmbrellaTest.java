import org.junit.Before;
import org.junit.Test;
import weapons.PenguinUmbrella;

import static org.junit.Assert.assertEquals;

public class PenguinUmbrellaTest {

    PenguinUmbrella penguinUmbrella;

    @Before
    public void before(){
        penguinUmbrella = new PenguinUmbrella();
    }

    @Test
    public void hasDamagePoints(){
        assertEquals(20, penguinUmbrella.attackPoints());
    }
}
