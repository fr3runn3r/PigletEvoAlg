

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ComprehensiveStrategyTest.
 *
 * @author  Peter Fletcher
 * @version 1.0
 */
public class ComprehensiveStrategyTest
{
    /**
     * Default constructor for test class ComprehensiveStrategyTest
     */
    public ComprehensiveStrategyTest()
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
    public void testGetSet()
    {
        ComprehensiveStrategy comprehe1 = new ComprehensiveStrategy();
        comprehe1.setResponse(1, 1, 1, true);
        assertEquals(true, comprehe1.getResponse(1, 1, 1));
    }
}

