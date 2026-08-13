class Solution {
    public boolean checkGoodInteger(int n) 
    {
       int digitSum=0,squareSum=0;
       while(n>0)
       {
        int d=n%10;
        digitSum+=d;
        squareSum+=Math.pow(d,2);
        n=n/10;
       } 
       return (squareSum-digitSum)>=50;
    }
}