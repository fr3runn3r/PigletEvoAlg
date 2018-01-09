import java.util.Random;

/**
 * Write a description of class Game here.
 *
 * @author Peter Fletcher
 * @version 0.1
 */
public class Game
{
    // instance variables - replace the example below with your own
    private Strategy strat1;
    private Strategy strat2;
    private Random random;
    private int offset;
    private int goal;

    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        strat1 = new ComprehensiveStrategy(10);
        strat2 = new ComprehensiveStrategy(10);
        offset = 0;
        goal = 10;
        random = new Random();
    }
    
    public Game(Strategy strat1, Strategy strat2, boolean randomiseStart)
    {
        this.strat1 = strat1;
        this.strat2 = strat2;
        goal = strat1.getGoal();
        random = new Random();
        if (randomiseStart) {
            offset = random.nextInt(1);
        } else {
            offset = 0;
        }
    }
    
    public int runGame()
    {
        int[] banked = new int[2];
        int k;
        int turn = 0;
        Strategy[] strats = new Strategy[2];
        strats[0] = strat1;
        strats[1] = strat2;
        boolean flip;
        while (turn < 50000)
        {
            k = 0;
            while (strats[(turn+offset)%2].getResponse(banked[(turn+offset)%2],banked[(turn+offset+1)%2],k))
            {
                flip = random.nextBoolean();
                if (flip)
                {
                    k++;
                } else {
                    k = 0;
                    break;
                }
                if ((banked[(turn+offset)%2]+k)>=goal) {return (turn+offset)%2;}
            }
            banked[(turn+offset)%2] += k;
            turn++;
        }
        return -1;
    }
    
    
}
