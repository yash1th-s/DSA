public class AllPermutations {
    public static void allPermutations(String str, String newStr){
        if(str.length()==0){
            System.out.println(newStr);
            return;
        }

        for(int i=0; i<str.length();i++){
            char currChar = str.charAt(i);
            String s = str.substring(0, i)+str.substring(i+1);
            allPermutations(s, newStr+currChar);
        }
    }

    public static void main(String args[]){
        allPermutations("abc", "");
    }
    
}
