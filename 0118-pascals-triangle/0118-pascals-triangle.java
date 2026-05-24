class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> list = new ArrayList<>();
        long res=1;

        for(int i=0;i<numRows;i++)
        {
            res=1;
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<i;j++)
            {
                row.add((int)res);
                res=res* (i-j) / (j+1);
            }
            row.add((int)res);
            list.add(row);
        }
        return list;
    }
}