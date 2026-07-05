class SummaryRanges {

    private TreeMap<Integer, int[]> map;

    public SummaryRanges() 
    {
        map = new TreeMap<>();
    }

    public void addNum(int value) {

        if (map.containsKey(value))
            return;

        Map.Entry<Integer, int[]> lower = map.floorEntry(value);
        Map.Entry<Integer, int[]> higher = map.ceilingEntry(value);

        // Already inside an interval
        if (lower != null && lower.getValue()[1] >= value)
            return;

        boolean leftMerge = lower != null && lower.getValue()[1] + 1 == value;
        boolean rightMerge = higher != null && higher.getKey() - 1 == value;

        if (leftMerge && rightMerge) 
        {
            lower.getValue()[1] = higher.getValue()[1];
            map.remove(higher.getKey());

        } 
        else if (leftMerge) 
        {

            lower.getValue()[1]++;

        } 
        else if (rightMerge) 
        {

            map.put(value, new int[]{value, higher.getValue()[1]});
            map.remove(higher.getKey());

        } 
        else 
        {
            map.put(value, new int[]{value, value});
        }
    }

    public int[][] getIntervals() 
    {
        return map.values().toArray(new int[map.size()][]);
    }
}

/**
 * Your SummaryRanges object will be instantiated and called as such:
 * SummaryRanges obj = new SummaryRanges();
 * obj.addNum(value);
 * int[][] param_2 = obj.getIntervals();
 */