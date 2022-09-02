public class StringReverse {

    public static void stringReverse(String str, int id){
        if(id == str.length()){
            return;
        }
        stringReverse(str, id+1);
        System.out.print(str.charAt(id));
    }

    public static void main(String args[]){
        stringReverse("abcdef", 0);
    }
    
}
