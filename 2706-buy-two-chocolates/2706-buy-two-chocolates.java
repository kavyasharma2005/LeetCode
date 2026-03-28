class Solution {
    public int buyChoco(int[] prices, int money) {
        int minsum = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++) {
            for(int j = i + 1; j < prices.length; j++) {
                int sum = prices[i] + prices[j];

                if(sum <= money && sum < minsum) {
                    minsum = sum;
                }
            }
        }

        if(minsum == Integer.MAX_VALUE) 
            return money;

        return money - minsum;
    }
}
