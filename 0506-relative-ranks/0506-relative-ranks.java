class Solution {
    public String[] findRelativeRanks(int[] score) 
    {

        int n = score.length;

        int[] copy = score.clone();

        // Sort in ascending order
        Arrays.sort(copy);

        HashMap<Integer, String> map = new HashMap<>();

        int rank = 1;

        // Traverse from largest score to smallest
        for (int i = n - 1; i >= 0; i--) 
        {

            if (rank == 1)
                map.put(copy[i], "Gold Medal");
            else if (rank == 2)
                map.put(copy[i], "Silver Medal");
            else if (rank == 3)
                map.put(copy[i], "Bronze Medal");
            else
                map.put(copy[i], String.valueOf(rank));

            rank++;
        }

        String[] ans = new String[n];

        // Fill answer in original order
        for (int i = 0; i < n; i++) 
        {
            ans[i] = map.get(score[i]);
        }

        return ans;
    }
}