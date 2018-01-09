import java.util.Random;

/**
 * Write a description of class CompreshensiveStrategy here.
 *
 * @author Peter Fletcher
 * @version 0.1
 */
public class ComprehensiveStrategy implements Strategy
{
    // boolean array which holds the strategy's responses
    private boolean[] strat;
    private int goal;

    /**
     * Constructor for objects of class CompreshensiveStrategy, creates a random strategy
     * for a game of size 10
     */
    public ComprehensiveStrategy()
    {
        // initialise instance variables
        strat = new boolean[1000];
        goal = 10;
        randomise();
    }
    
    public ComprehensiveStrategy(int goal)
    {
        // initialise instance variables
        this.goal = goal;
        strat = new boolean[goal * goal * goal];
        randomise();
    }

    public boolean getResponse(int i, int j, int k)
    {
        // put your code here
        return strat[goal*goal*i + goal*j + k];
    }
    
    public void setResponse(int i, int j, int k, boolean response)
    {
        strat[goal*goal*i + goal*j + k] = response;
        return;
    }
    
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
