class Solution {
    public static int splitArray(int[] nums, int k)
    {
        int low = maximum(nums), high = summation(nums);

        while(low <= high)
        {
            int mid = low + (high - low)/2;

            int ans = possible(nums, mid);

            if(ans > k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }

    public static int maximum(int[] arr)
    {
        int max = Integer.MIN_VALUE;

        for(int i : arr)
            max = Math.max(max, i);

        return max;
    }

    public static int summation(int[] arr)
    {
        int sum = 0;

        for(int i : arr)
            sum += i;

        return sum;
    }

    public static int possible(int[] arr, int cap)
    {
        int subarrays = 1, load = 0;

        for(int i : arr)
        {
            if(load + i <= cap)
                load += i;
            else
            {
                subarrays++;
                load = i;
            }
        }

        return subarrays;
    }
}