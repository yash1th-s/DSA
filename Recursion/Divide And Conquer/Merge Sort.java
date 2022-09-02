public class MergeSort {

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    //Time complexity : O(nlogn)
    public static void mergeSort(int arr[], int si, int ei){
        
        if(si>=ei) 
            return;

        int mid = si + (ei - si)/2;

        //left part
        mergeSort(arr, si, mid);
        //right part
        mergeSort(arr, mid+1, ei);
        //merge left part and right part
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        //left(0,3)=4  right(4,6)=4 -> 6-0+1 = 7
        int temp[] = new int[ei-si+1];
        int i = si; //iterator for left part
        int j = mid+1; //iterator for right part
        int k = 0; //iterator for temp

        while(i<=si && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++; k++;
            }
            else{
                temp[k] = arr[j];
                j++; k++;
            }
        }

        //for left-over elements
        //for left part
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        //for right part
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //copy temp to original array
        for(k=0, i=si; k<temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8,10,-2,-9};
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }
    
}
