package twodarray;
import java.util.*;

public class basic {
    
    //search any key value in 2darray
    public static boolean search(int matrix[][] ,int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
               if(matrix[i][j]==key){
                System.out.print("("+i + "," +j +" )");
                return true;
               }
            }
        }
        return false;

    }

    
    public static void main(String[] args) {
        int matrix [][] = new int[3][3];
        Scanner sc =new Scanner(System.in);
        int n=3,m=3;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j]= sc.nextInt();

            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
               System.out.print( matrix[i][j] +" ");

            }
            System.out.println();
        }
        int key=5;
        search(matrix, key);
    }
    
}
