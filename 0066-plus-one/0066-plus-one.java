class Solution {
    public int[] plusOne(int[] digits) {
         int i,j,size=digits.length,count=0,c=0;
        for(i=0;i<size;i++)
            {
            if(digits[i]==9)
            count++;
            c++;
            }
        if(count==size)
        {
            int a[]=new int[size+1];
            a[0]=1;
            return a;
        }
        else
        {
            for(i=size-1;i>=0;i--)
            {
                if(digits[i]==9)
                digits[i]=0;
                else
                {
                    digits[i]++;
                    break;
                }
            }
        }
        return digits;
    }
}