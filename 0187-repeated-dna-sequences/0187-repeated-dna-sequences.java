class Solution {

    public List<String> findRepeatedDnaSequences(String s) {

        List<String> ans = new ArrayList<>();

        int n = s.length();

        if (n < 10) return ans;

        Map<Character, Integer> value = new HashMap<>();
        value.put('A', 1);
        value.put('C', 2);
        value.put('G', 3);
        value.put('T', 4);

        long p = 31;
        long highestPower = 1;

        for (int i = 0; i < 9; i++) {
            highestPower *= p;
        }

        long hash = 0;

        // first window
        for (int i = 0; i < 10; i++) {
            hash = hash * p + value.get(s.charAt(i));
        }

        Set<Long> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();

        seen.add(hash);

        for (int i = 10; i < n; i++) {

            hash -= value.get(s.charAt(i - 10)) * highestPower;

            hash *= p;

            hash += value.get(s.charAt(i));

            if (!seen.add(hash)) {
                repeated.add(s.substring(i - 9, i + 1));
            }
        }

        return new ArrayList<>(repeated);
    }
}