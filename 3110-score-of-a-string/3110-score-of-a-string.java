class Solution {
    public int scoreOfString(String s) 
    {
        int sum1=0;
        for(int i=0;i<s.length()-1;i++)
        {
        char ch1=s.charAt(i);
        char ch2=s.charAt(i+1);
        sum1+=Math.abs(ch1-ch2);
        }
      return sum1;
    }
}