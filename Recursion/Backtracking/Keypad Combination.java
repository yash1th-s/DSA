public class KeypadCombinations {

    public static String keypad[]={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printCombination(String str, String combi, int i){
        if(i == str.length()){
            System.out.println(combi);
            return;
        }

        char currChar = str.charAt(i);
        String key = keypad[currChar-'0'-1];
        for(int j=0;j<key.length();j++){
            printCombination(str, combi+key.charAt(j), i+1);
        }
    }

    public static void main(String args[]){
        String str = "23";
        printCombination(str, "", 0);

    }
    
}
