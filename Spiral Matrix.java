import java.util.*;

public class SpiralMatrix {

    public static void printSpiralMatrix(int matrix[][]){
        int colStart = 0, rowStart = 0, colEnd = matrix[0].length-1, rowEnd = matrix.length-1;

        while(colStart<=colEnd && rowStart<=rowEnd){
          
          //loop for printing top rows
            for(int i=colStart;i<=colEnd;i++){
                System.out.print(matrix[rowStart][i]+" ");
            }
            rowStart++;
          
          //loop for printing right columns
            for(int i=rowStart;i<=rowEnd;i++){
                System.out.print(matrix[i][colEnd]+" ");
            }
            colEnd--;

          //loop for printing bottom row
            for(int i=colEnd;i>=colStart;i--){
                System.out.print(matrix[rowEnd][i]+" ");
            }
            rowEnd--;

          //loop for printing left columns
            for(int i=rowEnd;i>=rowStart;i--){
                System.out.print(matrix[i][colStart]+" ");
            }
            colStart++;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[4][4];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        printSpiralMatrix(matrix);
    }
    
}
