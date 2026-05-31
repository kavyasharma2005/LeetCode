class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) 
    {
        Arrays.sort(asteroids);

        long curmass= mass;

        for (int i : asteroids) 
        {
            if (curmass >= i)
                curmass += i;
            else
                return false;
        }

        return true;
    }
}