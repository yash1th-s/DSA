public class RotatedSortedArray {

    public static int rotatedSearch(int arr[], int key,int si, int ei){
        if(si > ei){
            return -1;
        }

        int mid = si + (ei - si)/2;

        //CASE found
        if(arr[mid] == key)
            return mid;

        //mid on line 1
        if(arr[si] <= arr[mid]){
            //case a: left
            if(arr[si]<=key && key<=arr[mid])
                return rotatedSearch(arr, key, si, mid-1);
            //case b: right
            else 
                return rotatedSearch(arr, key, mid+1, ei);
        }

        //mid on line 2
        else{
            //case c: right
            if(arr[mid]<=key && key<=arr[ei])
                return rotatedSearch(arr, key, mid+1, ei);
            //case d: left
            else 
                return rotatedSearch(arr, key, si, mid-1);
        }

    }

    public static void main(String args[]){
        int arr[] = {4, 5, 6, 7, 0, 1, 2, 3};
        int key = 9;
        System.out.println(rotatedSearch(arr, key, 0, arr.length-1));
    }
    
}
