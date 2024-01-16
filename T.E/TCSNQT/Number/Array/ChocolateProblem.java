import java.util.Arrays;

public class ChocolateProblem {
      public static void main(String[] args) {
            int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
            int n = arr.length;
            int m = 5;
            
            System.out.println(findMinDiff(arr, 8, 5));
      }

      public static int findMinDiff (int[] a, int n, int m)
    {
        // your code here
        Arrays.sort(a);
        
        if(m>n){
            return -1;
        }
        
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int check_diff = i+m-1;
            if(check_diff>=n){
                break;
            }
            int diff = a[check_diff]-a[i];
            min = Math.min(min,diff);
            
        }
        return min;
    }
}

