public class N_Queens {

  // function to check if the position is safe to place the Queen in the board
    public static boolean isSafe(char[][] board, int row, int col){
      
        //vertically up
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q')
                return false;
        }

        //left up diagonal
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q')
                return false;
        }

        //right up diagonal
        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j]=='Q')
                return false;
        }

        return true;

    }

    //TC = O(n!) 
    public static void NQueens(char[][] board, int row){
        //base case
        if(row == board.length){
            printBoard(board);
            return;
        }

        //column loop
        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                NQueens(board, row+1);//function call
                board[row][j] = 'x'; //Backtracking step
            }
        }
    }

    public static void printBoard(char[][] board){
        System.out.println("-----chess board------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int n = 5;
        char[][] board = new char[n][n];

        //intialization
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'x';
            }
        }

        NQueens(board, 0);
    }
    
}
