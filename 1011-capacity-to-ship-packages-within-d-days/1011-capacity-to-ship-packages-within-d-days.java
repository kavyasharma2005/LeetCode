class Solution {
    public static int maximum(int[] weights)
    {
        int max = Integer.MIN_VALUE;
        for(int i : weights)
            max = Math.max(max, i);
        return max;
    }
    public static int summation(int []weights)
    {
        int sum=0;
        for(int i:weights)
        {
            sum+=i;
        }
        return sum;
    }
    public static int shipWithinDays(int[] weights, int days)
    {
        int low=maximum(weights),high= summation(weights);
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            int ans=possible(weights,mid);
            if(ans<=days)
                high=mid-1;
            else
                low=mid+1;
        }
        return low;
    }
    public static int possible(int arr[],int cap)
    {
        int days=1,load=0;
        for(int i:arr)
        {
            if(load + i <= cap)
                load += i;
            else
            {
                days++;
                load = i;
            }
        }
        return days;
    }
}