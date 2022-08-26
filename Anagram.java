import java.util.Arrays;

public class anagram {

    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] s1CharArray = s1.toCharArray();
        char[] s2CharArray = s2.toCharArray();

        Arrays.sort(s1CharArray);
        Arrays.sort(s2CharArray);
        
        //printArray(s1CharArray);
        //printArray(s2CharArray);

        if(Arrays.equals(s1CharArray, s2CharArray))
            return true;
        else 
            return false;
    }

    public static void printArray(char arr[]){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }

    public static void main(String args[]){
        String s1 = "race";
        String s2 = "care";
        System.out.println(isAnagram(s1, s2));

    }
    
}
