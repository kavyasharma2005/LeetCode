class Solution {
    public int findClosest(int x, int y, int z)
    { int dist1,dist2;
    dist1=z-x;
    dist2=z-y;
    if(Math.abs(dist1)<Math.abs(dist2))
    return 1;
    else if(Math.abs(dist1)>Math.abs(dist2))
    return 2;
    else 
    return 0;
    }
}