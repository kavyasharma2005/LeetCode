class Solution {
    public int findPermutationDifference(String s, String t) 
    { int sum=0,diff=0;
    for(int i=0;i<s.length();i++)
    {
        for(int j=0;j<t.length();j++)
        {
            if(s.charAt(i)==t.charAt(j))
            diff=Math.abs(i-j);
        }
        sum+=diff;
        diff=0;
    }
        return sum;
    }
}