public class clear_i_bits {

    public static int clearIBits(int n,int i){
        int bitMask = (-1)<<i;
        System.out.println(bitMask);
        return n & bitMask;
    }

    public static void main(String args[]){
        System.out.println(clearIBits(10, 2));
    }
    
}
