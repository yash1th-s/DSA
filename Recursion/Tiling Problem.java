public class TilingProblem {

    public static int tilingProblem(int n){
        
        //Base case
        //when n == 0 placing no tile is also considered as 1 way.
        if(n==0 || n==1)
            return 1;
        
      /*       2 * n floor
           _____________________
          |                     | 
          |_____________________|
          <---------n------------>
      */
        //vertical Placement
        int fnm1 = tilingProblem(n-1);

        //horizontal Placement
        int fnm2 = tilingProblem(n-2);

        return fnm1+fnm2;
    }

    public static void main(String args[]){
        System.out.println(tilingProblem(2));
    }
    
}
