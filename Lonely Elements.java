import java.util.*;

public class LonelyElts {

    public static ArrayList<Integer> findLonely(ArrayList<Integer> list){
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.sort(list);
        if(list.size() == 1){
            return list;
        }
        for(int i=1;i<list.size()-1;i++){
            if(list.get(i-1)+1 != list.get(i) && list.get(i+1)-1 != list.get(i)){
                arr.add(list.get(i));
            }
        }
        if(list.get(0) != list.get(1)-1){
            arr.add(list.get(0));
        }
        if(list.get(list.size()-1)-1 != list.get(list.size()-2)){
            arr.add(list.get(list.size()-1));
        }
        return arr;
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(7);list.add(3);list.add(4);list.add(6);
        System.out.println(findLonely(list));
    }
    
}
