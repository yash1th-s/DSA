public class Subsets {

    public static void findSubsets(String str, String newStr,int i){
        if(i==str.length()){
            System.out.println(newStr);
            return;
        }
        
        findSubsets(str, newStr+str.charAt(i), i+1);
        findSubsets(str, newStr, i+1);
    }

    public static void main(String args[]){
        String str = "abc";
        findSubsets(str, "", 0);
    }
    
}
