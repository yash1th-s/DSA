public class BinarySearch_SortedMatrix {
  
  //Binary Search
    public static int binarySearch(int arr[], int key){
        int low = 0, hi = arr.length-1;
        while(low<=hi){
            int mid = (low+hi)/2;
            if(arr[mid] == key)
                return mid;
            else if(key > arr[mid])
                low = mid+1;
            else 
                hi = mid-1;
        }
        return -1;
    }

    //Time Complexity : O(nlog(m))  n:row  m:columns
    public static void searchSortedMatrix(int matrix[][], int key){
        int row = 0, col;
      
        while(row<matrix.length){
          
            if((col = binarySearch(matrix[row], key)) != -1){
                System.out.println("Element fount at row "+row+" and column "+col);
                return;
            }
          
            else row++;
        }
        System.out.println("Element not fount");
    }

  
    public static void main(String args[]){
        int nums[][] = { {10,20,30,40},
                         {15,25,35,45},
                         {27,29,37,48},
                         {32,33,39,50} };
        searchSortedMatrix(nums, 41);
    }
    
}
