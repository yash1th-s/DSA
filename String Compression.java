import java.util.*;

public class String_compression {

    public static void stringCompression(String str){
        StringBuilder sb = new StringBuilder("");
        int count = 0;
      
        for(int i=0;i<str.length();i++){
            count = 1;
            sb.append(str.charAt(i));
          
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
            count++;
            i++;
            }
          
        if(count > 1){
            sb.append(count);
          }
        }
        System.out.println(sb);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        stringCompression(str);

    }
    
}
