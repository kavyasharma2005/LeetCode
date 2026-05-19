class Solution {
    public int findMaxLength(int[] nums) 
    {
        HashMap <Integer,Integer> map=new HashMap<>();
        int sum=0,len=0,maxlen=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            sum+=-1;
            else
            sum+=1;
            if(map.containsKey(sum))
            {
                maxlen=Math.max(i-map.get(sum),maxlen);
            }
            else
            {
            map.put(sum,i);
            }
        }
    return maxlen;   
    }
}