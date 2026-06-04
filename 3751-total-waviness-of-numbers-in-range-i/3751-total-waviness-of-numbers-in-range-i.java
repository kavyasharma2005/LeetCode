class Solution {
    public int totalWaviness(int num1, int num2) 
    {
        int total = 0;

        for (int num = num1; num <= num2; num++) 
        {

            int[] digits = new int[10]; 
            int len = 0;
            int temp = num;

            while (temp > 0) 
            {
                digits[len++] = temp % 10;
                temp /= 10;
            }

            if (len < 3) continue;

            // check peaks & valleys (note: digits are reversed)
            int waviness = 0;

            for (int i = 1; i < len - 1; i++) 
            {
                int prev = digits[i + 1]; // reversed indexing
                int curr = digits[i];
                int next = digits[i - 1];

                if (curr > prev && curr > next) 
                {
                    waviness++; // peak
                } 
                else if (curr < prev && curr < next) 
                {
                    waviness++; // valley
                }
            }

            total += waviness;
        }

        return total;
    }
}