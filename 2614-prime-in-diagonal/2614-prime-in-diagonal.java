class Solution {
    public int diagonalPrime(int[][] nums) 
    {
        int i,j,count,maxprime=0;
        int n = nums.length;

        for(i=0;i<n;i++) 
        {
            // Main diagonal
            int prime = nums[i][i];

            if(prime > 1){
                count=0;
                for(j=2;j<=Math.sqrt(prime);j++)
                {
                    if(prime%j==0)
                    {
                        count=1;
                        break;
                    }
                }
                if(count==0)
                    maxprime=Math.max(prime,maxprime);
            }

            // Secondary diagonal
            int prime2 = nums[i][n-i-1];

            if(prime2 > 1){
                count=0;
                for(j=2;j<=Math.sqrt(prime2);j++)
                {
                    if(prime2%j==0)
                    {
                        count=1;
                        break;
                    }
                }
                if(count==0)
                    maxprime=Math.max(prime2,maxprime);
            }
        }

        return maxprime;
    }
}