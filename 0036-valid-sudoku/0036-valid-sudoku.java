class Solution {
    public static boolean issafe(char board[][],int row,int col,int digit){
        for(int i=0;i<board.length;i++){
           if( board[i][col]==digit){
             return false;
           }
        }
        for(int j=0;j<board.length;j++){
            if(board[row][j]==digit){
                return false;
            }
        }
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValid(char[][] board, int row, int col){
           if(col == board[0].length){
                row++;
                col = 0;
            }
        if(row == board.length){
                return true;
            }
    
            char digit = board[row][col];
            if(digit != '.'){
                board[row][col] = '.';
                if(!issafe(board, row, col, digit)){
                    return false;
                }
            
                board[row][col] = digit;
            }
            return isValid(board, row, col+1);
        }
    
    public boolean isValidSudoku(char[][] board) {
        return isValid(board,0,0);
    }
}