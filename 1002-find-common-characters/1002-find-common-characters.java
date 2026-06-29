class Solution {

    public List<String> commonChars(String[] words) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: frequency of first word
        for (char c : words[0].toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: process remaining words
        for (int i = 1; i < words.length; i++) {

            HashMap<Character, Integer> curr = new HashMap<>();

            for (char c : words[i].toCharArray()) {
                curr.put(c, curr.getOrDefault(c, 0) + 1);
            }

            // update with minimum frequency
            for (char key : map.keySet()) {
                map.put(key, Math.min(map.get(key), curr.getOrDefault(key, 0)));
            }
        }

        // Step 3: build answer
        List<String> ans = new ArrayList<>();

        for (char key : map.keySet()) {
            int count = map.get(key);

            while (count > 0) {
                ans.add(String.valueOf(key));
                count--;
            }
        }

        return ans;
    }
}