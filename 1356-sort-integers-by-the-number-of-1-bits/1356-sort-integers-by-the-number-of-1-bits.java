class Solution {
    public int[] sortByBits(int[] arr) 
    {
        int count=0,num=0;
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            num=arr[i];
            count=0;
            while(num>0)
            {
                if(num%2==1)
                count++;
                num/=2;
            }
            res[i]=count;
        }
        int n=arr.length;
         for (int i = 0; i < n - 1; i++)
         {
            for (int j = 0; j < n - 1 - i; j++) 
            {
            if (res[j] > res[j + 1]||(res[j] == res[j + 1] && arr[j] > arr[j + 1]))
            {
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
            temp=res[j];
            res[j]=res[j+1];
            res[j+1]=temp;
            }
            }
         }
    return arr;
    }
}