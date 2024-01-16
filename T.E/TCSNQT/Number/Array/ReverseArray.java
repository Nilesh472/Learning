import java.util.Arrays;

public class ReverseArray {
      public static void main(String[] args) {
            int arr[] = {1,2,3,4,5};
            int n = arr.length;
            int temp[] = new int[n];
            for (int index = n-1; index >= 0; index--) {
                 temp[n-index-1] = arr[index];
            }
            System.out.println(Arrays.toString(temp)); 
      }
}
