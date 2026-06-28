import java.util.*;

class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {

        int n = arr.length;

        int left = 0;
        while (left + 1 < n && arr[left] <= arr[left + 1]) {
            left++;
        }

        if (left == n - 1) return 0;

        int right = n - 1;
        while (right > 0 && arr[right - 1] <= arr[right]) {
            right--;
        }

        int ans = Math.min(n - left - 1, right);

        // Just storing suffix indices in a deque
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = right; i < n; i++) {
            dq.offerLast(i);
        }

        for (int i = 0; i <= left; i++) {

            while (!dq.isEmpty() && arr[dq.peekFirst()] < arr[i]) {
                dq.pollFirst();
            }

            if (!dq.isEmpty()) {
                ans = Math.min(ans, dq.peekFirst() - i - 1);
            }
        }

        return ans;
    }
}