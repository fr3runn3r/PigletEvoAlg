class TestProgram
{
    static public void main(String[] args)
    {
        Strategy strat = new ComprehensiveStrategy(2);
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                for (int k = 0; k < 2; k++)
                {
                    System.out.println(i + ", " + j + ", " + k + ": " + strat.getResponse(i,j,k));
                }
            }
        }
        System.out.println();
    }
}
