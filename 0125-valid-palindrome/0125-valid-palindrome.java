class Solution {
    public boolean isPalindrome(String s) 
    {
        String s1=" ";
        String s2=" ";
        for(int i=0;i<s.length();i++)
        {
            char ch1=s.charAt(i);
            char ch2=s.charAt(s.length()-1-i);
            if(Character.isLetter(ch1)||Character.isDigit(ch1))
            s1=s1+ch1;
            if(Character.isLetter(ch2)||Character.isDigit(ch2))
            s2=s2+ch2;
        }
        s1=s1.trim();
        s2=s2.trim();
        return (s1.equalsIgnoreCase(s2));
    }
}