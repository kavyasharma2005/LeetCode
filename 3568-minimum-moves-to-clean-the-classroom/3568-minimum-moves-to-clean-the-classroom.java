class Solution {
    public int minMoves(String[] classroom, int energy) {

        int m = classroom.length;
        int n = classroom[0].length();

        int[][] litter = new int[m][n];

        int sr = 0, sc = 0;
        int count = 0;

        // Find S and give every L an index
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                char ch = classroom[i].charAt(j);

                if (ch == 'S') {
                    sr = i;
                    sc = j;
                }

                if (ch == 'L') {
                    litter[i][j] = count;
                    count++;
                }
            }
        }

        // No litter
        if (count == 0) {
            return 0;
        }

        /*
         * mask:
         * 1 -> litter still remaining
         * 0 -> litter collected
         *
         * Example: 3 litter
         * 111 = all remaining
         * 110 = one collected
         * 000 = all collected
         */
        int fullMask = (1 << count) - 1;

        /*
         * visited[row][col][energy][mask]
         */
        boolean[][][][] visited =
                new boolean[m][n][energy + 1][1 << count];

        /*
         * state = {row, col, remainingEnergy, mask}
         */
        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{sr, sc, energy, fullMask});

        visited[sr][sc][energy][fullMask] = true;

        int moves = 0;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty()) {

            int size = q.size();

            while (size-- > 0) {

                int[] cur = q.poll();

                int r = cur[0];
                int c = cur[1];
                int e = cur[2];
                int mask = cur[3];

                // All litter collected
                if (mask == 0) {
                    return moves;
                }

                // No energy -> cannot move
                if (e == 0) {
                    continue;
                }

                // Try 4 directions
                for (int k = 0; k < 4; k++) {

                    int nr = r + dr[k];
                    int nc = c + dc[k];

                    // Outside grid
                    if (nr < 0 || nr >= m ||
                        nc < 0 || nc >= n) {
                        continue;
                    }

                    // Obstacle
                    if (classroom[nr].charAt(nc) == 'X') {
                        continue;
                    }

                    int newEnergy = e - 1;
                    int newMask = mask;

                    char ch = classroom[nr].charAt(nc);

                    // R = refill energy
                    if (ch == 'R') {
                        newEnergy = energy;
                    }

                    // L = collect litter
                    if (ch == 'L') {
                        int bit = litter[nr][nc];

                        newMask = newMask & ~(1 << bit);
                    }

                    if (!visited[nr][nc][newEnergy][newMask]) {

                        visited[nr][nc][newEnergy][newMask] = true;

                        q.add(new int[]{
                            nr,
                            nc,
                            newEnergy,
                            newMask
                        });
                    }
                }
            }

            moves++;
        }

        return -1;
    }
}