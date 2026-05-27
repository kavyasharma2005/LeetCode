class Solution {
    public int numberOfSpecialChars(String word) 
    {
        HashMap<Character,Integer> lower = new HashMap<>();
        HashMap<Character,Integer> upper = new HashMap<>();

        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);

            if(Character.isLowerCase(ch))
            {
                lower.put(ch,i);     // last lowercase
            }
            else
            {
                char c = Character.toLowerCase(ch);

                if(!upper.containsKey(c))
                {
                    upper.put(c,i);   // first uppercase 
                }
            }
        }

        int count=0;

        for(char c: lower.keySet())
        {
            if(upper.containsKey(c) && lower.get(c) < upper.get(c))
            {
                count++;
            }
        }

        return count;
    }
}