class Solution {
    public int maxProfit(int[] prices) 
    {
        int j,maxprf=0,minprice=prices[0];
        for(j=0;j<=prices.length-1;j++)
        {
            if(prices[j]<minprice)
            minprice=prices[j];
            else
            {
                maxprf=Math.max(maxprf,prices[j]-minprice);
            }
        }  
     return maxprf;
    }
}