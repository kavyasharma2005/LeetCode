class Solution {

    public List<Integer> selfDividingNumbers(int left, int right) 
    {

        List<Integer> ans = new ArrayList<>();

        for (int num = left; num <= right; num++) 
        {
            if (isSelfDividing(num)) 
            {
                ans.add(num);
            }
        }

        return ans;
    }

    public boolean isSelfDividing(int num) 
    {

        int temp = num;

        while (temp > 0) 
        {

            int digit = temp % 10;

            // If digit is 0 or num is not divisible by digit
            if (digit == 0 || num % digit != 0) 
            {
                return false;
            }

            temp /= 10;
        }

        return true;
    }
}