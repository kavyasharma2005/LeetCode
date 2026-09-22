class Solution {

    int k;
    Node[] tree;

    class Node {
        int product;
        int[] count;

        Node() {
            product = 1 % k;
            count = new int[k];
        }
    }

    Node merge(Node left, Node right) {
        Node res = new Node();

        res.product = (left.product * right.product) % k;

        // Prefixes completely inside left
        for (int i = 0; i < k; i++) {
            res.count[i] += left.count[i];
        }

        // Prefixes that cross from left into right
        for (int i = 0; i < k; i++) {
            int rem = (left.product * i) % k;
            res.count[rem] += right.count[i];
        }

        return res;
    }

    void build(int node, int l, int r, int[] nums) {

        if (l == r) {
            int val = nums[l] % k;

            tree[node].product = val;
            tree[node].count[val] = 1;
            return;
        }

        int mid = (l + r) / 2;

        build(node * 2, l, mid, nums);
        build(node * 2 + 1, mid + 1, r, nums);

        tree[node] = merge(tree[node * 2], tree[node * 2 + 1]);
    }

    void update(int node, int l, int r, int index, int value) {

        if (l == r) {
            int val = value % k;

            tree[node] = new Node();
            tree[node].product = val;
            tree[node].count[val] = 1;

            return;
        }

        int mid = (l + r) / 2;

        if (index <= mid) {
            update(node * 2, l, mid, index, value);
        } else {
            update(node * 2 + 1, mid + 1, r, index, value);
        }

        tree[node] = merge(tree[node * 2], tree[node * 2 + 1]);
    }

    Node query(int node, int l, int r, int ql, int qr) {

        if (ql <= l && r <= qr) {
            return tree[node];
        }

        int mid = (l + r) / 2;

        if (qr <= mid) {
            return query(node * 2, l, mid, ql, qr);
        }

        if (ql > mid) {
            return query(node * 2 + 1, mid + 1, r, ql, qr);
        }

        Node left = query(node * 2, l, mid, ql, qr);
        Node right = query(node * 2 + 1, mid + 1, r, ql, qr);

        return merge(left, right);
    }

    public int[] resultArray(int[] nums, int k, int[][] queries) {

        this.k = k;

        int n = nums.length;

        tree = new Node[4 * n];

        for (int i = 0; i < tree.length; i++) {
            tree[i] = new Node();
        }

        build(1, 0, n - 1, nums);

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int index = queries[i][0];
            int value = queries[i][1];
            int start = queries[i][2];
            int x = queries[i][3];

            // Permanent update
            update(1, 0, n - 1, index, value);

            // Consider nums[start ... n-1]
            Node result = query(1, 0, n - 1, start, n - 1);

            ans[i] = result.count[x];
        }

        return ans;
    }
}