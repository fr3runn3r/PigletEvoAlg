
/**
 * General interface for strategies
 *
 * @author Peter Fletcher
 * @version 0.1
 */
public interface Strategy
{
    
    /**
     * Method to determine the strategy's response to a given situation
     *
     * @param i  This strategy's current banked score
     * @param j  The opposing strategy's current banked score
     * @param k  The strategy's current unbanked score
     * @return   Returns a boolean representing whether the strategy will flip again
     */
    boolean getResponse(int i, int j, int k);
    
    /**
     * Method to change the strategy's current response in a given situation
     * 
     * @param i     This strategy's current banked score
     * @param j     The opposing strategy's current banked score
     * @param k     The strategy's current unbanked score
     * @param response Response to set target position to
     */
    void setResponse(int i, int j, int k, boolean response);
    
    int getGoal();
}
