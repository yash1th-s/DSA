public class RotatedSortedArray2 {

    public static int search(int arr[], int key){
        int lo=0, hi = arr.length-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;

            if(arr[mid] == key)
                return mid;
            
            //mid on line 1
            else if(arr[lo]<=arr[mid]){
                if(arr[lo]<=key && key<=arr[mid])
                    hi = mid - 1;
                else 
                    lo = mid + 1;
            }
            //mid on line 2
            else{
                if(arr[mid]<=key && key<=arr[hi])
                    lo = mid + 1;
                else 
                    hi = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[] = {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println(search(arr, 9));
    }
    
}
