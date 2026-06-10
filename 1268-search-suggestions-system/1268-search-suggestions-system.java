class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);

        List<List<String>> ans = new ArrayList<>();
        String prefix = "";

        for (char ch : searchWord.toCharArray()) {
            prefix += ch;

            List<String> curr = new ArrayList<>();

            for (String product : products) {
                if (product.startsWith(prefix)) {
                    curr.add(product);
                    if (curr.size() == 3)
                        break;
                }
            }

            ans.add(curr);
        }

        return ans;
    }
}