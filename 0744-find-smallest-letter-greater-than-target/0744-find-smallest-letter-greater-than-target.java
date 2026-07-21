class Solution 
{

    public char nextGreatestLetter(char[] letters, char target) 
    {

        int low = 0;
        int high = letters.length - 1;

        while (low <= high) 
        {

            int mid = low + (high - low) / 2;

            if (letters[mid] > target) 
            {
                high = mid - 1;   // look for a smaller valid answer
            } 
            else 
            {
                low = mid + 1;    // need a bigger letter
            }
        }

        // Wrap around if no greater letter exists
        return letters[low % letters.length];
    }
}