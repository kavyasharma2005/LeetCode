import java.util.HashMap;

class Solution {
    public int countSpecialIntegers(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) 
        {
            if (i == 0 || arr[i] != arr[i - 1]) 
            {
                if (map.containsKey(arr[i])) 
                {
                    map.put(arr[i], 2);
                } 
                else 
                {
                    map.put(arr[i], 1);
                }
            }
        }

        int count = 0;

        for (int value : map.values()) 
        {
            if (value == 1) 
            {
                count++;
            }
        }

        return count;
    }
}