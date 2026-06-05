class Solution 
{
    public String minWindow(String s, String t) 
    {
        HashMap<Character, Integer> minWindow = new HashMap<>();
        HashMap<Character, Integer> actWindow = new HashMap<>();

        for (char c : t.toCharArray())
        {
            minWindow.put(c, minWindow.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int formed = 0;
        int required = minWindow.size();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) 
        {
            char c = s.charAt(right);

            
            actWindow.put(c, actWindow.getOrDefault(c, 0) + 1);

            if (minWindow.containsKey(c) &&
                actWindow.get(c).intValue() == minWindow.get(c).intValue()) 
            {
                formed++;
            }

            while (formed == required) 
            {
                if (right - left + 1 < minLen) 
                {
                    minLen = right - left + 1;
                    start = left;
                }

                char temp = s.charAt(left);

                actWindow.put(temp, actWindow.get(temp) - 1);

                if (minWindow.containsKey(temp) &&
                    actWindow.get(temp).intValue() < minWindow.get(temp).intValue()) 
                {
                    formed--;
                }

                left++;
            }

            right++;
        }

        return (minLen == Integer.MAX_VALUE) ? "" : s.substring(start, start + minLen);
    }
}