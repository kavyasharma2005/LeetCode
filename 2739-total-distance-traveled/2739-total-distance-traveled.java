class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) 
    {
        int km=0;
        while(mainTank>0)
        {
            if(mainTank>=5)
            {
            km+=5;
            mainTank-=5;
            if(additionalTank>0)
            {
                additionalTank--;
                mainTank++;
            }
            }
            else
            {
                km+=mainTank;
                mainTank=0;
            }
        }
        return km*10;
    }
}