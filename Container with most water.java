import java.util.*;

public class Container {

        //brute force O(n^2)
        public static int container(ArrayList<Integer> height){
            int max_vol = 0;
            for(int i=0;i<height.size()-1;i++){
                for(int j=i+1;j<height.size();j++){
                    int width = j - i;
                    int h = Integer.min(height.get(i), height.get(j));
                    int vol = h * width;
                    if(vol>max_vol){
                        max_vol = vol;
                    }
                }
            }
            return max_vol;
        }

    //Two pointer method: O(n)
    public static int storeWater(ArrayList<Integer> height){
        int lp = 0, rp = height.size()-1;
        int maxWater = 0;
        while(lp < rp){
            int width = rp - lp;
            int ht = Math.min(height.get(lp), height.get(rp));
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);
            if(height.get(lp) < height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        //1, 8, 6, 2, 5, 4, 8, 3, 7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        int res = storeWater(height);
        System.out.println(res);
    }
    
}
