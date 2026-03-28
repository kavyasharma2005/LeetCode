class Solution {
    public boolean isBalanced(String num) 
    {
        int sumE=0,sumO=0;
        for(int i=0;i<num.length();i++)
        {
            if(i%2==0)
            sumE+=num.charAt(i)-'0';
            else
            sumO+=num.charAt(i)-'0';
        }
        return sumE==sumO;
    }
}