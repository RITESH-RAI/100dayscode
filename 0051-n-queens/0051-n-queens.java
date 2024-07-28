class Solution {
   public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        List<List<String>> res = new ArrayList<>();
        int[] leftRow = new int[n];
        int[] upperDiag = new int[2 * n - 1];
        int[] lowerDiag = new int[2 * n - 1];

        solve(0, board, res, leftRow, upperDiag, lowerDiag);
        return res;
    }

    private void solve(int col, char[][] board, List<List<String>> res, int[] leftRow, int[] upperDiag, int[] lowerDiag) {
        int n = board.length;
        if (col == n) {
            res.add(construct(board));
            return;
        }

        for (int row = 0; row < n; row++) {
            if (leftRow[row] == 0 && lowerDiag[row + col] == 0 && upperDiag[n - 1 + col - row] == 0) {
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiag[row + col] = 1;
                upperDiag[n - 1 + col - row] = 1;

                solve(col + 1, board, res, leftRow, upperDiag, lowerDiag);

                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiag[row + col] = 0;
                upperDiag[n - 1 + col - row] = 0;
            }
        }
    }

    private static List<String> construct(char[][] board) {
        List<String> res = new LinkedList<>();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }


}