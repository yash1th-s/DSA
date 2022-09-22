import java.util.*;

//Array is a rotated sorted array
public class PairSum2 {

    public static boolean pairSum(ArrayList<Integer> list, int target){
        int i, n = list.size();
        for(i=0;i<n-1;i++){
            if(list.get(i) > list.get(i+1)){
                break;
            }
        }
        int lp = i+1, rp = i;

        while(lp != rp){
            if(list.get(lp) + list.get(rp) == target){
                System.out.println(lp+" "+rp);
                return true;
            }
            else if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1)%n;
            }
            else {
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);list.add(15);list.add(6);list.add(8);list.add(9);list.add(10);
        int target = 17;
        System.out.println(pairSum(list, target));
    }
    
}
