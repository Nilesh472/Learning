import java.util.Arrays;

public class Cal_Median {
      public static void main(String[] args) {
             double median;
            int[] arr = {4, 7, 1, 2, 5, 6};
            Arrays.sort(arr);
            int n = arr.length;
            
            if(n%2==0){
                  int first = (n/2)-1;
                  int sec = n/2;
                  median = (double)(arr[first] + arr[sec])/2;
                  System.out.println(median);
            }
            else{
                  median = (double)arr[n/2];
                  System.out.println(median);
            }

            System.out.println("Median of the array is: "+median);
            
      }

}
