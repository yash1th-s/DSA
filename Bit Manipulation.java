public class bitmanipulation {

    public static int getBit(int n, int pos){
        int bitMask = 1<<pos;
        return ((n & bitMask)>>pos);
    }

    public static int setBit(int n, int pos){
        int bitMask = 1<<pos;
        return (n | bitMask);
    }

    public static int clearBit(int n, int pos){
        int bitMask = ~(1<<pos);
        return (n & bitMask);
    }

    public static int updateBit(int n, int pos){
        if(getBit(n, pos) == 0)
            return setBit(n, pos);
        else 
            return clearBit(n, pos);
    }

    public static int clearIBits(int n,int i){
        int bitMask = (-1)<<i;
        System.out.println(bitMask);
        return n & bitMask;
    }

    public static int clearRangeOfBits(int n, int i, int j){
        int a = -1<<(j+1);
        int b = ~(-1<<i);
        int bitMask = a | b ;
        return n & bitMask;
    }

    public static void main(String args[]){
        System.out.println(clearRangeOfBits(10, 2, 4));
    }
    
}
