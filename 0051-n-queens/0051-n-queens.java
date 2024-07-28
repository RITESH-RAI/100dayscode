class Solution {
    List<List<String>> ans= new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
      char board[][]= new char[n][n];
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            board[i][j]='.';
        }
        }
        nqueens(board,0);
        return ans;
    }
    public void nqueens(char board[][],int row){
        if(row==board.length){
            printboard(board);
            return ;
        }
        for(int j=0;j<board.length;j++){
            if(issafe(board,row,j)){
                board[row][j]='Q';
                nqueens(board,row+1);
                board[row][j]='.';
            }
        }
    }
    public boolean issafe(char board[][],int row,int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
            return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 &&j>=0;i--,j--){
            if(board[i][j]=='Q'){
            return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 &&j<board.length;i--,j++){
             if(board[i][j]=='Q'){
            return false;
            }
        }
        return true;
    }
    public void printboard(char board[][]){
        List<String> ls= new ArrayList<>();
        for(int i=0;i<board.length;i++){
    String str="";
     for(int j=0;j<board.length;j++)   {
         str+=board[i][j];
         
     }    
            ls.add(str);
}
        ans.add(ls);
        
}
    
}