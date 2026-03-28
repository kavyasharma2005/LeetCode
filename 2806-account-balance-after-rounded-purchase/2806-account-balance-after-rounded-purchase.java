class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount)
    {
        int n;
        n=purchaseAmount%10;
        if(n>4)
        purchaseAmount+=10-n;
        else
        purchaseAmount-=n;
        return (100-purchaseAmount);
    }
}