class Solution {
    public int maxProfit(int[] prices) 
    {
        int minprice=Integer.MAX_VALUE;
        int profit=0;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<minprice)
            minprice=prices[i];
            
            profit=prices[i]-minprice;

            maxprofit=Math.max(profit,maxprofit);
        }
        return maxprofit;
    }
}