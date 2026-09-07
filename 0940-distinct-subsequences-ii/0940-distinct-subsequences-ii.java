class Solution {
    public int distinctSubseqII(String s) {
        int MOD = 1000000007;
        int n = s.length();

        long[] dp = new long[n + 1];
        dp[0] = 1;

        long[] last = new long[26];

        for (int i = 1; i <= n; i++) {
            int ch = s.charAt(i - 1) - 'a';

            // Every old subsequence can either take or not take this character
            dp[i] = (2 * dp[i - 1]) % MOD;

            // Remove duplicates caused by previous occurrence
            dp[i] = (dp[i] - last[ch] + MOD) % MOD;

            // Store the subsequences ending with this character
            last[ch] = dp[i - 1];
        }

        // Empty subsequence is not counted
        return (int) (dp[n] - 1 + MOD) % MOD;
    }
}