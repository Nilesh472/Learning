import java.util.Arrays;

public class ArrayIncrese_Decrease {
      public static void main(String[] args) {
            int arr[] = {3,4,5,2,1,7};
            int n = arr.length;
            Arrays.sort(arr);

            for(int i=0;i<n/2; i++){
                  System.out.print(arr[i]);
            }
            for(int j=n-1; j>=n/2; j--){
                  System.out.print(arr[j]);
            }
      }

       
}