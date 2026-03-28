class Solution {
    public int[][] flipAndInvertImage(int[][] image) 
    {
        int n=image.length;
        for(int i=0;i<=n-1;i++)
        {
            for(int j=0;j<n/2;j++)
            {
               int temp=image[i][j];
                image[i][j]=image[i][n-1-j];
                image[i][n-1-j]=temp;
                if(image[i][j]==0)
                image[i][j]=1;
                else
                image[i][j]=0;
                if(image[i][n-1-j]==1)
                image[i][n-1-j]=0;
                else
                image[i][n-1-j]=1;             
            }
        }
       int  i=0;
       if(n%2==1)
        while(i<n)
        {
            if(image[i][n/2]==0)
            image[i][n/2]=1;
            else
            image[i][n/2]=0;
            i++;
        }
        return image;
    }
}