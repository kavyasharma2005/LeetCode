class Solution {
    public boolean isPowerOfFour(int n) {

        if (n <= 0) {
            return false;
        }

        double k = Math.log(n) / Math.log(4);

        return  Math.abs(k - Math.round(k)) < 1e-10;
    }
}