class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) 
    {

        int n = grid.length;
        int size = n * n;

        int[] freq = new int[size];

        for (int[] row : grid) 
        {
            for (int num : row) 
            {
                freq[num - 1]++;
            }
        }

        int repNo= -1;
        int misNo = -1;

        for (int i = 0; i < size; i++) 
        {

            if (freq[i] == 2)
                repNo = i + 1;

            if (freq[i] == 0)
                misNo = i + 1;
        }

        return new int[]{repNo, misNo};
    }
}