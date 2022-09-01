public class FriendPairing {

    public static int friendsPairing(int n){
        //Base case
        if(n==1 || n==2){
            return n;
        }

        //single
        int fnm1 = friendsPairing(n-1);

        //pair
        int fnm2 = (n-1) * friendsPairing(n-2);

        //total
        return fnm1 + fnm2 ;
    }

    public static void main(String args[]){
        System.out.println(friendsPairing(3));
    }
    
}
