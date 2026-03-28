class Solution {
    public double[] convertTemperature(double celsius)
    {
      double f=0.0,k=0.0;
      k=celsius+273.15;
      f=celsius*1.8 +32.0;
      double ans[]={k,f};
      return ans;
    }
}