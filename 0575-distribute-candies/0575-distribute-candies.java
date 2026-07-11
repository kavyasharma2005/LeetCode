class Solution {
    public int distributeCandies(int[] candyType) 
    {
        HashSet<Integer>set=new HashSet<>();
        int count=0;
        for(int num:candyType)
        {
            if(!set.contains(num))
            {
            set.add(num);
            count++;
            }
        }
        return (count<candyType.length/2)?count:candyType.length/2;
    }
}