class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder binary = new StringBuilder();

        for (char ch : s.toCharArray()) 
        {
            String b = Integer.toBinaryString(ch);

            // Add leading zeros to make exactly 8 bits
            binary.append("0".repeat(8 - b.length()));
            binary.append(b);
        }

        String str = binary.toString();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}