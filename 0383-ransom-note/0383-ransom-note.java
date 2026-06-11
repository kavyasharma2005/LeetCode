class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        for (char ch : ransomNote.toCharArray()) {
            int idx = magazine.indexOf(ch);

            if (idx == -1) {
                return false;
            }

            magazine = magazine.substring(0, idx)
                     + magazine.substring(idx + 1);
        }

        return true;
    }
}