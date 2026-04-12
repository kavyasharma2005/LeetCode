class Solution {
    public int maxArea(int[] height) 
    {
            int vol=0,maxvol=0;
            int left=0;
            int right=height.length-1;
            while(left<right)
            {
                vol=Math.min(height[left],height[right])*(right-left);
                maxvol=Math.max(maxvol,vol);
                if(height[left]<height[right])
                left++;
                else
                right--;
            }
        return maxvol; 
    }
}