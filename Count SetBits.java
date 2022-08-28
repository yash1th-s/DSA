public class count_setbits {

    //TC : O(log(n))
    public static int countOfSetbits(int n){
        int count = 0;
        // while(n>0){
        //     int rem = n%2;
        //     if(rem == 1){
        //         count++;
        //     }
        //     n /= 2;
        // }
        while(n>0){
            if((n & 1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static void main(String args[]){
        System.out.println(countOfSetbits(2));
    }
    
}
