import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] res = new int[n - k + 1];

        Deque<Integer> dq = new ArrayDeque<>();
        int ind = 0;

        // first window
        for (int i = 0; i < k; i++) {

            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);
        }

        res[ind++] = nums[dq.peekFirst()];

        // remaining windows
        for (int i = k; i < n; i++) {

            // remove smaller elements
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            // remove out of window
            if (dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            res[ind++] = nums[dq.peekFirst()];
        }

        return res;
    }
}