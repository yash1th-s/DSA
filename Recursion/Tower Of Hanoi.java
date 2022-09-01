public class TowerOfHanoi {

    public static void towerOfHanoi(int n, String S, String H, String D){
        if(n==1){
            System.out.println("Move disk from "+S+" to "+D);
            return;
        }
        towerOfHanoi(n-1, S, D, H);
        System.out.println("Move disk from "+S+" to "+D);
        towerOfHanoi(n-1, H, S, D);
    }

    public static void main(String args[]){
        towerOfHanoi(2, "A", "B", "C");
    }
    
}
