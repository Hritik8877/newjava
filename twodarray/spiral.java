package twodarray;

public class spiral {
    public static void spir(int matrix[][]){
        int startRow=0;
        int stsrtcol =0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
        while (startRow<=endrow && stsrtcol<=endcol) {
            for(int j=stsrtcol; j<=endrow; j++){
                System.out.print(matrix[startRow] [j]+" ");
            }
            for(int i=startRow+1; i<=endcol; i++){
                System.out.print(matrix[i][endcol]+" ");
            }

            for(int j=endcol-1; j>=stsrtcol; j--){
                if (startRow==endrow) {
                    break;
                    
                }
                System.out.print(matrix[endrow] [j]+" ");

            }
            for(int i=endrow-1; i>=startRow+1; i--){
                if (stsrtcol==endcol) {
                    break;
                    
                }
                System.out.print(matrix[i] [stsrtcol]+" ");
            }
            stsrtcol++;
            startRow++;
            endcol--;
            endrow--;

            
        } 
        System.out.println();

    }
    public static void main(String[] args) {
        int matrix[][] ={{1,2,3,4},
                        {5,6,7,8}
                         ,{9,10,11,12},
                        {13,14,15,16}};
          spir(matrix);              
        
    }
    
}
