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

    public static void main(String args[]){
        System.out.println(updateBit(7, 2));
    }
    
}
