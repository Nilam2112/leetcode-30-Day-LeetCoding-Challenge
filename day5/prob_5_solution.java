class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int profit = 0;
        for(int j=1; j<prices.length; j++)
            {
            int difference = prices[j]-prices[j-1];
            if(difference > 0)
                {
                    profit += difference;
                }
            }
    return profit;
    }
}//     } 