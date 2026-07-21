class Solution {

    public int numOfUnplacedFruits(int[] fruits, int[] baskets) 
    {

        int count = 0;
        boolean[] used = new boolean[baskets.length];

        for (int fruit : fruits) 
        {

            boolean placed = false;

            for (int i = 0; i < baskets.length; i++) 
            {

                if (!used[i] && baskets[i] >= fruit) 
                {
                    used[i] = true;
                    placed = true;
                    break;
                }
            }

            if (!placed)
                count++;
        }

        return count;
    }
}