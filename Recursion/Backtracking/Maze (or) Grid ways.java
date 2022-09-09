public class GridWays {

    //TC : 0(2^(n+m))
    public static int totalWays(int n, int m, int i,int j){
        if(i==n-1 || j==m-1){
            return 1;
        }
        if(i>=n || j>=m){
            return 0;
        }

        return totalWays(n, m, i+1, j)+totalWays(n, m, i, j+1);
    }

    public static void main(String args[]){
        System.out.println(totalWays(3, 3, 0, 0));
    }
    
}
