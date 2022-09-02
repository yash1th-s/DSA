public class KeyCombination {

    static String map[] = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printKeyCombination(String nums, int idx, String newStr){
        if(idx == nums.length()){
            System.out.println(newStr);
            return;
        }

      //retriving string from array map for current int
        char c = nums.charAt(idx);
        String combi = map[c-'0'];
      
      //iteration through each char from the retrived string
        for(int i=0; i<combi.length(); i++){
            printKeyCombination(nums, idx+1, newStr+combi.charAt(i));
        }
    }
    

    public static void main(String args[]){
        printKeyCombination("23", 0, "");
    }
    
}
