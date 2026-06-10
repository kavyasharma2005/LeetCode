class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1 || numRows >= s.length())
            return s;

        String[] ans = new String[numRows];

        for (int i = 0; i < numRows; i++) {
            ans[i] = "";
        }

        int i = 0;

        while (i < s.length()) {

            // down
            for (int row = 0; row < numRows && i < s.length(); row++) {
                ans[row] += s.charAt(i++);
            }

            // up diagonally
            for (int row = numRows - 2; row > 0 && i < s.length(); row--) {
                ans[row] += s.charAt(i++);
            }
        }

        String res = "";

        for (String str : ans) {
            res += str;
        }

        return res;
    }
}