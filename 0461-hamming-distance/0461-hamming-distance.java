class Solution {
    public int hammingDistance(int x, int y) 
    {
        int i, count=0,bits=0;
        int max=(x<y)?y:x;
        while(max>0)
        {
            max/=2;
            count++;
        }
        int arr1[]=new int[count];
        int arr2[]=new int[count];
        for(i=count-1;i>=0;i--)
        {
            arr1[i]=x%2;
            arr2[i]=y%2;
            if(arr1[i]!=arr2[i])
            bits++;
            x/=2;
            y/=2;
        }
        return bits;
    }
}