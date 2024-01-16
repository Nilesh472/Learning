

public class AverageOfNumber {
      public static void main(String[] args) {
            double sum = 0;
            int[] arr = {11,3,5,2,5};
            int n = arr.length;
            //Arrays.sort(arr);

            for(int i=0; i<n; i++){
                  sum = sum+arr[i];
            }
            System.out.println((double)(sum/n));

      }
}
