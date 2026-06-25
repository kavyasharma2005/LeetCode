class Solution {
    public String decodeString(String s) {

        Stack<Integer> counts = new Stack<>();
        Stack<String> strings = new Stack<>();

        String curr = "";
        int num = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            else if (ch == '[') {
                counts.push(num);
                strings.push(curr);

                num = 0;
                curr = "";
            }

            else if (ch == ']') {

                int repeat = counts.pop();
                String prev = strings.pop();

                String repeated = "";

                for (int j = 0; j < repeat; j++) {
                    repeated += curr;
                }

                curr = prev + repeated;
            }

            else {
                curr += ch;
            }
        }

        return curr;
    }
}