class Solution {
    public int reverseDegree(String s) 
    { int sum=0,pro=1;
    for(int i=1;i<=s.length();i++)
    {
        pro=0;
    pro=(26-(s.charAt(i-1)-97) )*i;
    sum+=pro;
    }
        return sum;
    }
}