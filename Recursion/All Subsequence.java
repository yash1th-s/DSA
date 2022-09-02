import java.util.HashSet;

public class AllSubsequence {

    //HashSet is used to avoid duplicate Strings
    static HashSet<String> set = new HashSet<>();

    public static void subsequence(String str, int idx, String newStr){
        if(idx == str.length()){
            if(set.contains(newStr))
                return;
            else{
                set.add(newStr);
                System.out.println(newStr);
                return;
            }
        }
      
        //to be present
        subsequence(str, idx+1, newStr+str.charAt(idx));
      
        //not to be present
        subsequence(str, idx+1, newStr);

    }

    public static void main(String args[]){
        subsequence("aba", 0, "");
    }
    
}
