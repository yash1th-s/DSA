public class QuickSort {

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void quickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }

        //pivot index
        int pid = partition(arr, si, ei);
        
        quickSort(arr, si, pid-1);  //left part of pivot
        quickSort(arr, pid+1, ei);  //right part of pivot
    }

    public static int partition(int arr[], int si, int ei){
        //pivot - last elt
        int pivot = arr[ei];
        int i = si-1;  //to make place fro elts less than pivot

        for(int j=si; j<ei; j++){

            if(arr[j] < pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        //
        int temp = arr[i];
        arr[i] = pivot;
        arr[ei] = temp;
        return i;
    }

    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8,10,-2,-9};
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
    
}
