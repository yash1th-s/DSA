public class Starircase_Search {

    //Time Complexity O(n+m)  n=no. of rows & m=no. of cols
    public static void staircaseSearch(int matrix[][], int key){
      
      //took starting point as cell (row,0) i.e. BOTTOM LEFT cell int the matrix
        int row = matrix.length-1, col = 0;
        boolean found=false;

        while(row>=0 && col<matrix[0].length){

            if(matrix[row][col]==key){
                System.out.println("Key "+key+" found at "+row+" row "+col+" column");
                found = true;
                break;
            }
          
          //greater than starting point, then go right
            else if(key>matrix[row][col])
                col++;
          
          //else go top
            else
                row--;
            
        }

        if(found == false)
            System.out.println("Key NOT found");
    }

    public static void main(String args[]){
        int nums[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        staircaseSearch(nums, 100);
    }
    
}
