class Solution {
    public String defangIPaddr(String address) 
    {
        String defang="";
        int pos=0;
        for(int i=0;i<address.length();i++)
        {
            if(address.charAt(i)=='.')
            {
                defang+=address.substring(pos,i);
                defang+="[.]";
            pos=i+1;
            }
        }
        defang+=address.substring(pos);
        return defang;
    }
}