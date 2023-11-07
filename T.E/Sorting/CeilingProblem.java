import java.util.Scanner;

public class CeilingProblem {
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();

            System.out.println("Enter the element of the array: ");
            int[] arr = new int[n];
            for(int i=0; i<arr.length; i++){
                  arr[i] = sc.nextInt();
            }
            System.out.println("Enter the target element: ");
            int target = sc.nextInt();
            int ans = ceiling(arr,target);
            System.out.println(ans);

            sc.close();
      }
      // Ceiling means return the smaller number greater than the target
      static int ceiling(int[] arr, int target){
            int start =0;
            int end = arr.length-1;

            while(start <= end){
                  int mid = start+(end-start)/2;

                  if(target < arr[mid]){
                        end = mid - 1;
                  }
                  else if(target > arr[mid]){
                        start = mid + 1;
                  }
                  else{
                        return mid;
                  }
            }
            return start;
      }
}
      

