class Solution {
    public int maxDistinct(String s) 
    {
         int count = 0;
char[] arr = s.toCharArray();
for (int i=0;i<arr.length; i++)
     {
        if(arr[i] != '0')
        {
            count++;
       for(int j=i+1; j<arr.length; j++)
       {
            if(arr[i] == arr[j] && arr[i] != '0')
            {
            arr[j]='0';
            }
       }
         }
     }
     return count;
    }
}