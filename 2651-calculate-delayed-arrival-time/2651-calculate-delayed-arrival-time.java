class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime)
    {
        int time=arrivalTime+delayedTime;
        time=time%24;
        return time;
    }
}