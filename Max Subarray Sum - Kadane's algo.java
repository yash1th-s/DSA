public class maxSubArr_kadanesAlgo {

    public static void main(String args[]){
      
        int arr[] = {-1, -2, -3, -4};
        boolean isPos = false;

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0;i<arr.length;i++){
          
          //checking for corner case, if +ve number present or not
            if(arr[i]>=0)
                isPos=true;
          
            currSum+=arr[i];
          
          //if current sum is -ve, then make it zero
            if(currSum<0)
                currSum = 0;
            
            if(currSum>maxSum)
                maxSum = currSum;
        }
      
      //if all are -ve nos. then return max of -ve nos.
        if(isPos==false){
            maxSum = Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>maxSum)
                    maxSum=arr[i];
            }
        }
        System.out.println("Maximum Subarray sum is "+maxSum);
    }
    
}
