public class TowerOfHanoi {

    public static void towerOfHanoi(int n, String S, String H, String D){
        if(n==1){
            System.out.println("Move disk "+n+" from "+S+" to "+D);
            return;
        }

        //transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n-1, S, D, H);
        //transfer nth from src to dest
        System.out.println("Move disk "+n+" from "+S+" to "+D);
        //transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n-1, H, S, D);
    }

    public static void main(String args[]){
        towerOfHanoi(2, "A", "B", "C");
    }
    
}
