import java.util.Random;

/**
 * Simplified hold at strategy
 *
 * @author Peter Fletcher
 * @version 0.1
 */
public class SimpleStrategy implements Strategy
{
    private int[] strat;
    private int goal;
    
    /**
     * Constructor for objects of class SimpleStrategy, creates a random strategy for a game with a goal of 10
     */
    public SimpleStrategy()
    {
        goal = 10;
        strat = new int[100];
        randomise();
    }
    
    /**
     * Constructor for objects of class SimpleStrategy, creates an optionally random strategy for a game with a goal of 10
     * 
     * @param random Whether the strategy should be randomised
     */
    public SimpleStrategy(boolean random)
    {
        goal = 10;
        strat = new int[100];
        if (random)
        {
            randomise();
        }
    }
    
    /**
     * Constructor for objects of class SimpleStrategy, creates a random strategy for a game with an arbitrary goal
     * 
     * @param goal The number at which this strategy considers it has won
     * @param random Whether the strategy should be randomised
     */
    public SimpleStrategy(int goal)
    {
        this.goal = goal;
        strat = new int[goal*goal];
        randomise();
    }
    
    /**
     * Constructor for objects of class SimpleStrategy, creates an optionally random strategy for a game with an arbitrary goal
     * 
     * @param goal The number at which this strategy considers it has won
     * @param random Whether the strategy should be randomised
     */
    public SimpleStrategy(int goal, boolean random)
    {
        this.goal = goal;
        strat = new int[goal*goal];
        if (random)
        {
            randomise();
        }
    }

    /**
     * Get the strategy's response in a given situation
     * 
     * @param i This strategy's current banked score
     * @param j The opposing strategy's current banked score
     * @param k This strategy's current unbanked score
     * 
     * @return returns the strategy's response
     */
    public boolean getResponse(int i, int j, int k)
    {
        int val = strat[goal * i + j];
        if (k <= val)
        {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Sets the strategy's response in a given situation
     * 
     * @param i This strategy's current banked score
     * @param j The opposing strategy's current banked score
     * @param k This strategy's current unbanked score
     * @param response The response that the situation should be set to
     * 
     */
    public void setResponse(int i, int j, int k, boolean response)
    {
        if (response)
        {
            strat[goal * i + j] = k;
        } else {
            strat[goal * i + j] = k - 1;
        }
    }
    
    /**
     * Return the goal this strategy plays to
     * 
     * @return Returns the goal
     */
    public int getGoal()
    {
        return goal;
    }
    
    /**
     * Randomise the current strategy
     */
    public void randomise()
    {
        Random random = new Random();
        for (int i = 0; i < goal*goal; i++)
        {
            strat[i] = random.nextInt(goal);
        }
    }
}
