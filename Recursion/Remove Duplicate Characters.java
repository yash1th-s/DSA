public class RemoveDuplicateChar {

    static boolean map[] = new boolean[26];
    static StringBuilder newStr = new StringBuilder("");

    public static StringBuilder rmvDuplicateChar(String str, int id){
        if(id == str.length())
            return newStr;

        char currChar = str.charAt(id);
        if(map[currChar - 'a'] == false){
            newStr.append(currChar);
            map[currChar - 'a'] = true;
        }

        return rmvDuplicateChar(str, id+1);
    }
    public static void main(String args[]){
        String str = "appnnacollegnne";
        System.out.println(rmvDuplicateChar(str, 0));
    }
    
}
