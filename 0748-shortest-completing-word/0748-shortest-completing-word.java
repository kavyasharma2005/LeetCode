class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) 
    {

        HashMap<Character, Integer> required = new HashMap<>();

        // Count letters in license plate
        for (int i = 0; i < licensePlate.length(); i++) 
        {

            char ch = Character.toLowerCase(licensePlate.charAt(i));

            if (ch >= 'a' && ch <= 'z') 
            {
                required.put(ch, required.getOrDefault(ch, 0) + 1);
            }
        }

        String answer = "";

        for (String word : words) 
        {

            HashMap<Character, Integer> map = new HashMap<>();

            // Count letters in current word
            for (int i = 0; i < word.length(); i++) 
            {
                char ch = word.charAt(i);

                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            boolean valid = true;

            // Check required letters
            for (char ch : required.keySet()) 
            {

                if (map.getOrDefault(ch, 0) < required.get(ch)) 
                {
                    valid = false;
                    break;
                }
            }

            if (valid) {

                if (answer.equals("") || word.length() < answer.length()) 
                {
                    answer = word;
                }
            }
        }

        return answer;
    }
}