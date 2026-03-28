class Solution {
    public String reversePrefix(String word, char ch) 
    {
        int i,pos=-1;
        String rev="";
        for(i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                pos=i;
                break;
            }
        }if(pos==-1)
        return word;
        else
        for(i=pos;i>=0;i--)
        {
            rev+=word.charAt(i);
        }
        word=rev+word.substring(pos+1);
        return word;
    }
}