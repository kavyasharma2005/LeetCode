import java.util.*;

class Solution {
    public List<Boolean> getResults(int[][] queries) {
        TreeSet<Integer> set = new TreeSet<>();
        List<Boolean> ans = new ArrayList<>();

        int max = 0;
        for (int[] q : queries) {
            if (q[0] == 1) max = Math.max(max, q[1]);
            else max = Math.max(max, q[1]);
        }

        SegmentTree seg = new SegmentTree(max + 2);

        set.add(0);
        set.add(max + 1);

        seg.update(max + 1, max + 1);

        for (int[] q : queries) {
            if (q[0] == 1) {
                int x = q[1];

                int left = set.lower(x);
                int right = set.higher(x);

                seg.update(right, right - x);
                seg.update(x, x - left);

                set.add(x);

            } else {
                int x = q[1];
                int sz = q[2];

                int left = set.floor(x);

                int best = seg.query(0, left);
                int tail = x - left;

                ans.add(Math.max(best, tail) >= sz);
            }
        }

        return ans;
    }

    class SegmentTree {
        int[] tree;
        int n;

        SegmentTree(int n) {
            this.n = n;
            tree = new int[4 * n];
        }

        void update(int idx, int val) {
            update(1, 0, n - 1, idx, val);
        }

        void update(int node, int l, int r, int idx, int val) {
            if (l == r) {
                tree[node] = val;
                return;
            }

            int mid = (l + r) / 2;

            if (idx <= mid)
                update(node * 2, l, mid, idx, val);
            else
                update(node * 2 + 1, mid + 1, r, idx, val);

            tree[node] = Math.max(tree[node * 2], tree[node * 2 + 1]);
        }

        int query(int L, int R) {
            return query(1, 0, n - 1, L, R);
        }

        int query(int node, int l, int r, int L, int R) {
            if (R < l || r < L) return 0;

            if (L <= l && r <= R) return tree[node];

            int mid = (l + r) / 2;

            return Math.max(
                query(node * 2, l, mid, L, R),
                query(node * 2 + 1, mid + 1, r, L, R)
            );
        }
    }
}