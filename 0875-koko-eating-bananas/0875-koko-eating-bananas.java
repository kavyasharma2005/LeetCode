class Solution {
         static long minHours(int[] arr, int mid) {
        long hours = 0;

        for (int i : arr) {
            hours += (int) Math.ceil((double) i / mid);
        }

        return hours;
    }

    public int minEatingSpeed(int arr[], int k) 
    {
        Arrays.sort(arr);
        int beg = 1, end = arr[arr.length - 1];

        while (beg <= end) {
            int mid = beg + (end - beg) / 2;

            long totalHours = minHours(arr, mid);

            if (totalHours <= k) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        return beg;
    }
}