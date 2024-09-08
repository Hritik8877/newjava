package backtracking;

public class nqueen {
    static int count =0;
   
    public static boolean issafe(char board[][],int row,int col){
        //vertical up
          for(int i=row; i>=0; i--){
            if (board[i][col]=='q') {
                return false;
                
            }
          }
        //diagonal left up
           for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
             if (board[i][j]=='q') {
                return false;
                              
             }
           }
        //diagonal right up
        for(int i=row-1 ,j=col+1; i>=0 && j<board.length; i--, j++){
            if (board[i][j]=='q') {
                return false;
                              
             }
        }
        return true;
    }


    public static void nqueens(char board [][],int row){

        
    if (row==board.length) {
        printchar(board);
        count++;
        return ;
        
    }
    int count=0;

        for(int j=0; j<board.length; j++){
            if(issafe(board,row,j)){
                board[row][j] ='q';
            nqueens(board, row+1);
            board[row][j] ='x';
            }
        }
        
    }

  
    

    public static void printchar(char board[][]){
        System.out.println("---------");
        for(int i=0; i<board.length; i++){
           for(int j=0; j<board.length; j++){
            System.out.print(board[i][j] +" ");
           }
           System.out.println(); 
        }
    }


    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0; i<n;i++){
            for(int j=0; j<n;j++){
                board[i][j]='x';
            }
        }
        nqueens(board, 0);
       System.out.println("the total number of solution : "+ count);
    }
    
}
