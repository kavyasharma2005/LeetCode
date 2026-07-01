class MyCalendar 
{
    TreeMap<Integer,Integer> calendar;
    public MyCalendar() 
    {
        calendar=new TreeMap<>();
    }
    public boolean book(int startTime, int endTime)
    {
        Integer prev = calendar.floorKey(startTime);

        if (prev != null && calendar.get(prev) > startTime)
            return false;

        Integer next = calendar.ceilingKey(startTime);

        if (next != null && next < endTime)
            return false;

        calendar.put(startTime, endTime);

        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */