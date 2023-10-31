

public class MaxvalueIn2DArray {
      public static void main(String[] args) {
            int[][] arr = {
                  {2,3,4,5},
                  {4,5,6,7},
                  {89,56,4,5}
            };
            System.out.println(Max(arr));
      }
      static int Max(int[][] arr){
            int max = Integer.MIN_VALUE;
            for(int r=0;r<arr.length;r++){
                  for(int c=0;c<arr[r].length;c++){
                        if(arr[r][c]>max){
                              max = arr[r][c];
                        }
                  }
            }
            return max;
            
      }
}
