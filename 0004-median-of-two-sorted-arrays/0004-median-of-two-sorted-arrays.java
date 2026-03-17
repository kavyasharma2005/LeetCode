class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
     {
        int i,j=0,n,m,temp,total;
        double med=0.0;
        m=nums1.length;
        n=nums2.length;
        int arr[]=new int[m+n];
        for(i=0;i<m;i++)
        {
            arr[i]=nums1[i];
        }
        for(i=m;i<m+n;i++)
        {
            arr[i]=nums2[j++];
        }
        for(i=0;i<n+m-1;i++)
        {
            for(j=0;j<n+m-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
         }
         total=n+m;
         if(total%2!=0)
         return arr[total/2];
         else 
         return (arr[total/2]+arr[(total/2)-1])/2.0;
     }
}
