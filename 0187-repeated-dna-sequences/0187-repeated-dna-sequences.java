class Solution {
    public List<String> findRepeatedDnaSequences(String s) {

        List<String> ans = new ArrayList<>();

        int n = s.length();
        int L = 10;

        if (n < L) return ans;

        long base = 5;
        long mod = 1000000007;

        long power = 1;

        for (int i = 0; i < L - 1; i++) {
            power = (power * base) % mod;
        }

        long hash = 0;

        for (int i = 0; i < L; i++) {
            hash = (hash * base + s.charAt(i)) % mod;
        }

        Map<Long, List<Integer>> map = new HashMap<>();

        map.putIfAbsent(hash, new ArrayList<>());
        map.get(hash).add(0);

        Set<String> added = new HashSet<>();

        for (int i = 1; i <= n - L; i++) {

            hash = (hash - s.charAt(i - 1) * power % mod + mod) % mod;
            hash = (hash * base + s.charAt(i + L - 1)) % mod;

            String curr = s.substring(i, i + L);

            if (map.containsKey(hash)) {

                for (int start : map.get(hash)) {

                    if (s.substring(start, start + L).equals(curr)) {

                        if (added.add(curr)) {
                            ans.add(curr);
                        }
                        break;
                    }
                }
            }

            map.putIfAbsent(hash, new ArrayList<>());
            map.get(hash).add(i);
        }

        return ans;
    }
}