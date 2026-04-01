class Solution {
    public boolean checkIfPangram(String sentence) 
    {
        boolean freq[]=new boolean[26];
        for(int i=0;i<sentence.length();i++)
        {
            freq[sentence.charAt(i)-'a']=true;
        }
        for(boolean b:freq)
        {
            if(b==false)
            return false;
        }
        return true;
    }
}