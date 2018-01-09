import java.util.Random;

/**
 * A strategy that has a boolean response for each possible game situation
 *
 * @author Peter Fletcher
 * @version 0.2
 */
public class ComprehensiveStrategy implements Strategy
{
    // boolean array which holds the strategy's responses
    private boolean[] strat;
    private int goal;

    /**
     * Constructor for objects of class ComprehensiveStrategy, creates a random strategy for a game with a goal of 10
     */
    public ComprehensiveStrategy()
    {
        strat = new boolean[1000];
        goal = 10;
        randomise();
    }
    
    /**
     * Constructor for objects of class ComprehensiveStrategy, creates an optionally random strategy for a game with a goal of 10
     * 
     * @param random Whether the strategy should be randomised
     */
    public ComprehensiveStrategy(boolean random)
    {
        strat = new boolean[1000];
        goal = 10;
        if (random)
        {
            randomise();
        }
    }
    
    /**
     * Constructor for objects of class ComprehensiveStrategy, creates a random strategy for a game with an arbitrary goal
     * 
     * @param goal The number at which this strategy considers it has won
     */
    public ComprehensiveStrategy(int goal)
    {
        this.goal = goal;
        strat = new boolean[goal * goal * goal];
        randomise();
    }
    
    /**
     * Constructor for objects of class ComprehensiveStrategy, creates an optionally random strategy for a game with an arbitrary goal
     * 
     * @param goal The number at which this strategy considers it has won
     * @param random Whether the strategy should be randomised
     */
    public ComprehensiveStrategy(int goal, boolean random)
    {
        this.goal = goal;
        strat = new boolean[goal * goal * goal];
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
        // put your code here
        return strat[goal*goal*i + goal*j + k];
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
        strat[goal*goal*i + goal*j + k] = response;
        return;
    }
    
    /**
     * Randomise the current strategy
     */
    public void randomise()
    {
        int size = goal * goal * goal;
        Random random = new Random();
        for (int i = 0; i < size; i++)
        {
            strat[i] = random.nextBoolean();
        }
    }
    
    public int getGoal()
    {
        return goal;
    }
}
