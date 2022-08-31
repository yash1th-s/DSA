public class xPowerN_logn {

    public static int xPowerN(int x, int n){
        if(n == 0){
            return 1;
        }

        int halfPow = xPowerN(x, n/2);
        int halfPowSq = halfPow * halfPow;

        /* Note: for time complexity to be O(log(n)) we have to call 
                the function only once(as in above) or else time complexity 
                increases to O(n).
         */

        //n is odd
        if(n%2 != 0){
            halfPowSq = x * halfPowSq;
        }
    
        return halfPowSq;
    }

    public static void main(String args[]){
        System.out.println(xPowerN(2, 10));
    }
    
}
