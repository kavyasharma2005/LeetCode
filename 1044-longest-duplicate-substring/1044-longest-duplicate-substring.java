class Solution {

    public String longestDupSubstring(String s) {

        int low = 1;
        int high = s.length() - 1;

        String ans = "";

        while (low <= high) {

            int len = low + (high - low) / 2;

            String duplicate = search(s, len);

            if (duplicate != null) {
                ans = duplicate;   // length exists
                low = len + 1;     // try longer length
            } else {
                high = len - 1;    // try shorter length
            }
        }

        return ans;
    }

    // Returns a duplicate substring of length len if it exists,
    // otherwise returns null.
    private String search(String s, int len) {

        long p = 31;

        // p^(len-1)
        long highestPower = 1;
        for (int i = 0; i < len - 1; i++) {
            highestPower *= p;
        }

        long hash = 0;

        // Build hash for first window
        for (int i = 0; i < len; i++) {
            hash = hash * p + (s.charAt(i) - 'a' + 1);
        }

        // hash -> list of starting indices
        // needed to verify collisions
        Map<Long, List<Integer>> map = new HashMap<>();

        map.put(hash, new ArrayList<>());
        map.get(hash).add(0);

        // Slide window
        for (int i = len; i < s.length(); i++) {

            // remove leftmost character
            hash -= (s.charAt(i - len) - 'a' + 1) * highestPower;

            // shift powers
            hash *= p;

            // add new character
            hash += (s.charAt(i) - 'a' + 1);

            int start = i - len + 1;

            // same hash seen before
            if (map.containsKey(hash)) {

                String current = s.substring(start, start + len);

                // verify actual strings
                // because hash collisions are possible
                for (int prevStart : map.get(hash)) {

                    if (s.substring(prevStart, prevStart + len)
                            .equals(current)) {

                        return current;
                    }
                }
            }

            map.computeIfAbsent(hash, k -> new ArrayList<>())
               .add(start);
        }

        return null;
    }
}