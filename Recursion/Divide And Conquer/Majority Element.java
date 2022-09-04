public class MajorityElement {

    // public static int majorityCount(int arr[]){
    //     for(int i=0; i<arr.length;i++){
    //         int count = 0;
    //         for(int j=0; j<arr.length;j++){
    //             if(arr[i]==arr[j]){
    //                 count++;
    //             }
    //         }
    //         if(count>arr.length/2)
    //             return arr[i];
    //     }
    //     return -1;
    // }
    
    public static int countInRange(int arr[], int n, int si, int ei){
        int count = 0;
        for(int i=si;i<=ei;i++){
            if(arr[i] == n){
                count++;
            }
        }
        return count;
    }

    public static int majorityCount(int arr[], int lo, int hi){
        if(lo==hi){
            return arr[lo];
        }

        int mid = lo+(hi-lo)/2;
        int left = majorityCount(arr, lo, mid);
        int right = majorityCount(arr, mid+1, hi);

        if(left == right){
            return arr[left];
        }

        int leftCount = countInRange(arr,left, lo, hi);
        int rightCount = countInRange(arr, right, lo, hi);

        return leftCount>rightCount ? left : right ;
    }

    public static void main(String args[]){
        int arr[] = {2,2,1,1,1,2,2,};
        System.out.println(majorityCount(arr, 0, arr.length-1));
    }
    
}
