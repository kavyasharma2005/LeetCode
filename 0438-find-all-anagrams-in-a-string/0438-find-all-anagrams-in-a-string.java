import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {

        List<Integer> ans = new ArrayList<>();

        char[] pArr = p.toCharArray();
        Arrays.sort(pArr);
        String target = new String(pArr);

        int k = p.length();

        for (int i = 0; i <= s.length() - k; i++) 
        {

            String sub = s.substring(i, i + k);

            char[] arr = sub.toCharArray();
            Arrays.sort(arr);

            if (target.equals(new String(arr))) 
            {
                ans.add(i);
            }
        }

        return ans;
    }
}