public class SumOfElement {
      public static void main(String[] args) {
            int arr[] = {3,5,3,2,1};
            int n = length(arr);
            int sum=0;
            for(int i=0;i<n;i++){
                  sum = sum+arr[i];
            }
            System.out.println("Sum of all element of array is: "+sum);
      }
      public static int length(int arr[]){
            int n = arr.length;
            return n;
      }

}
