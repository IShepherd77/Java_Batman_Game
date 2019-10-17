import behaviours.IHero;
import behaviours.IVillain;
import enemies.Joker;
import enemies.Penguin;
import heroes.Batman;
import org.junit.Before;
import org.junit.Test;
import other.Arena;
import other.Game;

import static org.junit.Assert.assertEquals;

public class GameTest {

    IHero batman;
    IVillain joker;
    IVillain penguin;
    Arena arena;
    Game game;

    @Before
    public void before(){
        batman = new Batman();
        joker = new Joker();
        penguin = new Penguin();
        arena = new Arena("Bat Cave");
        game = new Game(batman, joker, arena);
    }

    @Test
    public void startingGame(){
        assertEquals("BatMan met The Joker in Bat Cave and they will FIGHT !!!!! (cheers for batman)", game.startGame());
    }

    @Test
    public void testVillainAttackHero(){
        game.villainAttackhero();
        assertEquals(185, batman.getHealthPoints());
    }
}
