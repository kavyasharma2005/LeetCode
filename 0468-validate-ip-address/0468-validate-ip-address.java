class Solution {

    public String validIPAddress(String queryIP) {

        if (queryIP.contains(".")) 
        {
            return isIPv4(queryIP) ? "IPv4" : "Neither";
        }

        if (queryIP.contains(":")) 
        {
            return isIPv6(queryIP) ? "IPv6" : "Neither";
        }

        return "Neither";
    }

    boolean isIPv4(String ip) 
    {

        String[] arr = ip.split("\\.", -1);

        if (arr.length != 4)
            return false;

        for (String s : arr) 
        {

            if (s.length() == 0 || s.length() > 3)
                return false;

            if (s.length() > 1 && s.charAt(0) == '0')
                return false;

            for (char c : s.toCharArray()) 
            {
                if (!Character.isDigit(c))
                    return false;
            }

            int num = Integer.parseInt(s);

            if (num < 0 || num > 255)
                return false;
        }

        return true;
    }

    boolean isIPv6(String ip) {

        String[] arr = ip.split(":", -1);

        if (arr.length != 8)
            return false;

        for (String s : arr) 
        {

            if (s.length() == 0 || s.length() > 4)
                return false;

            for (char c : s.toCharArray()) 
            {

                if (!(Character.isDigit(c) || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F')))
                    return false;
            }
        }

        return true;
    }
}