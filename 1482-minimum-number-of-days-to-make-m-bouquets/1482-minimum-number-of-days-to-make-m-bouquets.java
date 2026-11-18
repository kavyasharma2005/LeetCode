class Solution {
     public static int minDays(int[] bloomDay, int m, int k)
    {
        if((long)k*m>bloomDay.length)
            return -1;

        int beg = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;

        for (int i : bloomDay) 
        {
           beg = Math.min(beg, i);
           end = Math.max(end, i);
        }
        while(beg<=end)
        {
            int mid=end+(beg-end)/2;
            if(possible(bloomDay,k,m,mid))
            {
                end = mid - 1;
            }
            else beg = mid + 1;
        }
        return beg;
    }
    public static boolean possible(int arr[],int k,int m,int day)
    {

        int count=0;
        int bouquets=0;
        for(int i:arr)
        {
            if(i<=day)
                count++;

            else
            {
                bouquets+=count/k;
                count=0;
            }
        }
        bouquets+=count/k;
        return bouquets>=m;
    }
}