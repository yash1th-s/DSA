public class BinaryString {

    public static void printBinString(int n, int lastPlace, String newStr){
        if(n == 0){
            System.out.println(newStr);
            return;
        }

        //lastplace == 0/1, by default 0 can come in the next place
        printBinString(n-1, 0, newStr+"0");
        
        //only when lastplace==0, 1 can can in the next place
        if(lastPlace == 0)
            printBinString(n-1, 1, newStr+"1");
        
    }

    public static void main(String args[]){
        printBinString(3, 0, "");
    }
    
}
