public class Search2D {
      public static void main(String[] args) {
            int[][] arr = {{12,21,3,4,5},
            {13,5,1,89,},
            {23,67,8,903}};
      
      }
      static int Search(int[][] arr, int target){
            for(int row=0;row<arr.length;row++){
                  for(int col=0;col<arr[row].length;col++){
                        if(arr[row][col]==target){
                              return
                        }
                  }
            }
      }
}  

