import java.util.*;
public class SearchIn2DArray {

      public static void main(String[] args) {
            int[][] arr = {
                  {23,23,34},
                  {45,56,78,89},
                  {87,45,87,43}
            };
            int target = 56;
            int[] ans = search(arr, target);
            System.out.println(Arrays.toString(ans));
      }
      static int[] search(int[][] arr, int target){
            for(int r=0; r<arr.length; r++){
                  for(int c=0; c<arr[r].length;c++){
                        if(arr[r][c] == target){
                              return new int[]{r, c};
                        }

                  }
            }
            return new int[]{-1,-1};
      }
      
}
