class CountIntervals {

    TreeMap<Integer, Integer> map;
    int count;

    public CountIntervals() {
        map = new TreeMap<>();
        count = 0;
    }

    public void add(int left, int right)
    {

        Integer start = map.floorKey(left);

        // Merge with previous interval if it overlaps
        if (start != null && map.get(start) >= left - 1) 
        {
            left = start;
            right = Math.max(right, map.get(start));
            count -= map.get(start) - start + 1;
            map.remove(start);
        }

        Integer next = map.ceilingKey(left);

        // Merge with all following overlapping intervals
        while (next != null && next <= right + 1) 
        {

            right = Math.max(right, map.get(next));

            count -= map.get(next) - next + 1;

            map.remove(next);

            next = map.ceilingKey(left);
        }

        map.put(left, right);

        count += right - left + 1;
    }

    public int count() 
    {
        return count;
    }
}

/**
 * Your CountIntervals object will be instantiated and called as such:
 * CountIntervals obj = new CountIntervals();
 * obj.add(left,right);
 * int param_2 = obj.count();
 */