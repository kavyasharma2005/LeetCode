class Solution {

    public int maximumCount(int[] nums) {

        int negative = firstGreaterEqualZero(nums);

        int positive = nums.length - firstPositive(nums);

        return Math.max(negative, positive);
    }

    public int firstGreaterEqualZero(int[] nums) {

        int low = 0;
        int high = nums.length;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] < 0)
                low = mid + 1;
            else
                high = mid;
        }

        return low;
    }

    public int firstPositive(int[] nums) {

        int low = 0;
        int high = nums.length;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] <= 0)
                low = mid + 1;
            else
                high = mid;
        }

        return low;
    }
}