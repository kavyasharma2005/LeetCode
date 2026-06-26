class Solution {
    public String removeOccurrences(String s, String part) {

        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) 
        {
            sb.append(ch);
            // If the end of sb is equal to part, remove it
            if (sb.length() >= part.length()) 
            {
                String last = sb.substring(sb.length() - part.length());

                if (last.equals(part)) 
                {
                    sb.delete(sb.length() - part.length(), sb.length());
                }
            }
        }

        return sb.toString();
    }
}