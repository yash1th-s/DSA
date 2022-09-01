import java.util.*;

public class Diagonal_sum {

    public static int diagonalSum(int matrix[][]){
        int n = matrix.length, sum = 0;

        for(int i=0;i<n;i++){
          
          //primary diagonal  
            sum += matrix[i][i];

          //secondary diagonal
          /*
          if condition is udes for duplicate sum in case of odd matrix 
          (e.x:In case of 3x3 matrix, middle term gets added twice, 
          to avoid that if condition is added)
          */
            if(i != n-1-i)
                //i+j = n-1
                sum += matrix[i][n-1-i];
        }
    return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[3][3];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(diagonalSum(matrix));
        sc.close();
    }
    
}
