class Solution {
    public int findComplement(int num) 
    {
        int sum=0,count=0;
        while(num>0)
        {
            if(num%2==0)
            sum+=Math.pow(2,count);
            count++;
            num/=2;
        }
        return sum;
    }
}