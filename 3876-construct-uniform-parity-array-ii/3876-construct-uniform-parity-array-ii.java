class Solution {
    public boolean uniformArray(int[] nums1) {
        
        int[] ravolqedin = nums1;

        int minOdd = Integer.MAX_VALUE;

        for (int num : ravolqedin) {
            if (num % 2 != 0) {
                minOdd = Math.min(minOdd, num);
            }
        }
        for (int num : ravolqedin) {
            if (num % 2 == 0 && minOdd != Integer.MAX_VALUE) {
                if (num < minOdd) {
                    return false;
                }
            }
        }

        return true;
    }
}