import java.util.*;

class Solution {
    public String sortVowels(String s) 
    {
        String vowel = "aeiouAEIOU";
        StringBuilder vowelString = new StringBuilder();

        for(char c : s.toCharArray())
        {
            if(vowel.indexOf(c) != -1)
            {
                vowelString.append(c);
            }
        }

        char[] Array = s.toCharArray();
        char[] word = vowelString.toString().toCharArray();

        Arrays.sort(word); 
        int k = 0;
        for(int i = 0; i < Array.length; i++)
        {
            if(vowel.indexOf(Array[i]) != -1)
            {
                Array[i] = word[k++];
            }
        }

        return new String(Array);
    }
}