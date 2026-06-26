class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each number
        for (int num : arr1) 
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int index = 0;

        // Place numbers in the order of arr2
        for (int num : arr2) 
        {
            while (map.containsKey(num) && map.get(num) > 0) 
            {
                arr1[index++] = num;
                map.put(num, map.get(num) - 1);
            }
        }

        // Store remaining numbers
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : map.keySet()) 
        {
            while (map.get(num) > 0) 
            {
                list.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        // Sort remaining numbers
        Collections.sort(list);

        // Add them to arr1
        for (int num : list) 
        {
            arr1[index++] = num;
        }

        return arr1;
    }
}