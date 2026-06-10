class Solution {
    public int compress(char[] chars) {

        int write = 0;
        int i = 0;

        while (i < chars.length) {

            char ch = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == ch) {
                count++;
                i++;
            }

            chars[write++] = ch;

            if (count > 1) {

                int start = write;

                while (count > 0) {
                    chars[write++] = (char)('0' + count % 10);
                    count /= 10;
                }

                // reverse the digits
                int left = start;
                int right = write - 1;

                while (left < right) {
                    char temp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = temp;
                    left++;
                    right--;
                }
            }
        }

        return write;
    }
}