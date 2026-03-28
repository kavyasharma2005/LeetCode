class Solution {
    public int maxContainers(int n, int w, int maxWeight)
    {
        int weight=0,c=0;
        c=maxWeight/w;
        if((n*n)>=c)
        return c;
        else 
        {
            return n*n;
        }

    }
}