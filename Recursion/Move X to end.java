public class MoveX {
    static int count = 0;
    static StringBuilder newStr = new StringBuilder("");

    public static void moveX(String str, int idx){
        if(idx == str.length()){
            for(int i=0; i<count; i++){
                newStr.append('x');
            }
            System.out.println(newStr);
            return;
        }

        if(str.charAt(idx) == 'x'){
            count++;
        }else{
            newStr.append(str.charAt(idx));
        }

        moveX(str, idx+1);
    }

    public static void main(String args[]){
        moveX("axbxcxxdxexxxf", 0);
    }
    
}
