import java.util.*;;

public class MostFrequent {

    public static int mostFreq(ArrayList<Integer> A, int key){
        int[] arr = new int[1001];
        for(int i=0;i<A.size()-1;i++){
            if(A.get(i) == key){
                arr[A.get(i+1)]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int res = 0;
        for(int i=0;i<=1000; i++){
            if(arr[i]>max){
                max = arr[i];
                res = i;
            }
        }
        return res;
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(100);list.add(200);list.add(1);list.add(100);list.add(6);
        System.out.println(mostFreq(list, 1));
    }
    
}
