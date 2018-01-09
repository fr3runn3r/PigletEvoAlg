

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GameTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GameTest
{
    /**
     * Default constructor for test class GameTest
     */
    public GameTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testGameTimeout()
    {
        ComprehensiveStrategy comprehe1 = new ComprehensiveStrategy(1);
        comprehe1.setResponse(0, 0, 0, false);
        Game game1 = new Game(comprehe1, comprehe1, false);
        assertEquals(-1, game1.runGame());
    }

    @Test
    public void testGame()
    {
        ComprehensiveStrategy winner = new ComprehensiveStrategy(1);
        winner.setResponse(0, 0, 0, true);
        ComprehensiveStrategy loser = new ComprehensiveStrategy(1);
        loser.setResponse(0, 0, 0, false);
        Game game1 = new Game(winner, loser, true);
        assertEquals(0, game1.runGame());
        Game game2 = new Game(loser, winner, true);
        assertEquals(1, game2.runGame());
    }
}


