class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) 
    {
        HashSet<Integer>a=new HashSet<>();
        HashSet<Integer>b=new HashSet<>();
        int ans[]=new int [A.length];
        int count;
        for(int i=0;i<A.length;i++)
        {
            count=0;
            a.add(A[i]);
            b.add(B[i]);
            for(int j:a)
            {
                if(b.contains(j))
                count++;
            }
            ans[i]=count;
        }
        return ans;
    }
}