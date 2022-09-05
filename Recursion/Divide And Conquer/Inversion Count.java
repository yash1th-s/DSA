public class Inversion_count {

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int merge(int arr[], int si, int mid, int ei){
        int i=si, j=mid+1, k=0;
        int invCount = 0;
        int temp[] = new int[ei-si+1];
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j])
                temp[k++] = arr[i++];
            else{
                temp[k++] = arr[j++];
                invCount += mid-i+1;
            }
        }
        while(i<=mid) 
            temp[k++] = arr[i++];
        while(j<=ei) 
            temp[k++] = arr[j++];

        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
        return invCount;
    }

    public static int mergeSort(int arr[], int si, int ei){
        int invCount = 0;
        if(ei>si){
            int mid = si+(ei-si)/2;
            invCount += mergeSort(arr, si, mid);
            invCount += mergeSort(arr, mid+1, ei);
            invCount += merge(arr, si, mid, ei);
        }
        return invCount;
    }

    public static void main(String args[]){
        int arr[] = {8, 4, 2, 1};
        System.out.println(mergeSort(arr, 0, arr.length-1));
        printArray(arr);
    }
    
}
