class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        int max= Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++)
        {
            max=Math.max(candies[i],max);
        }
        ArrayList<Boolean> b = new ArrayList<>();
        for(int i=0;i<candies.length;i++)
        {
            b.add((candies[i] + extraCandies) >= max);
        }
        return b;
    }
}