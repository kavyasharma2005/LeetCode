class Solution {

    class TrieNode {
        TrieNode[] child = new TrieNode[26];
        int idx = -1;
    }

    TrieNode root = new TrieNode();

    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {

        root.idx = smallestWordIndex(wordsContainer);

        for (int i = 0; i < wordsContainer.length; i++) {
            insert(wordsContainer[i], i, wordsContainer);
        }

        int[] ans = new int[wordsQuery.length];

        for (int i = 0; i < wordsQuery.length; i++) {
            ans[i] = search(wordsQuery[i]);
        }

        return ans;
    }

    void insert(String word, int index, String[] words) {
        TrieNode node = root;

        update(node, index, words);

        for (int i = word.length() - 1; i >= 0; i--) {
            int ch = word.charAt(i) - 'a';

            if (node.child[ch] == null) {
                node.child[ch] = new TrieNode();
            }

            node = node.child[ch];
            update(node, index, words);
        }
    }

    int search(String word) {
        TrieNode node = root;

        for (int i = word.length() - 1; i >= 0; i--) {
            int ch = word.charAt(i) - 'a';

            if (node.child[ch] == null) break;

            node = node.child[ch];
        }

        return node.idx;
    }

    void update(TrieNode node, int index, String[] words) {
        if (node.idx == -1 ||
            words[index].length() < words[node.idx].length()) {
            node.idx = index;
        }
    }

    int smallestWordIndex(String[] words) {
        int idx = 0;

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < words[idx].length()) {
                idx = i;
            }
        }

        return idx;
    }
}