public class RatInMaze {

    public static boolean isSafe(int maze[][], int i, int j, int n){
        if(i>=0 && j>=0 && i<n && j<n && maze[i][j]==1){
            return true;
        }
        return false;
    }

    public static boolean ratInMaze(int maze[][], int n, int i, int j, int solArr[][]){

        if(i==n-1 && j==n-1){
            solArr[i][j] = 1;
            System.out.println(solArr[i][j]);
            return true;
        }

        if(isSafe(maze, i, j, n)){
            solArr[i][j] = 1;
            if(ratInMaze(maze, n, i+1, j, solArr)){
                return true;
            }
            if(ratInMaze(maze, n, i, j+1, solArr)){
                return true;
            }
            solArr[i][j] = 0;
            return false;
        }
        return false;
        
        }

        public static void printArr(int solArr[][]){
            for(int i=0;i<solArr.length;i++){
                for(int j=0;j<solArr.length;j++){
                    System.out.print(solArr[i][j]);
                }
                System.out.println();
            }
        }
  

    public static void main(String args[]){
        int maze[][] = { { 1, 0, 0, 0 },
                        { 1, 1, 1, 1 },
                        { 0, 0, 1, 0 },
                        { 1, 1, 1, 1 } };
        int N = maze.length;
        int solArr[][] = new int[N][N]; 
        ratInMaze(maze, N, 0, 0, solArr);
        printArr(solArr);
    }
}
