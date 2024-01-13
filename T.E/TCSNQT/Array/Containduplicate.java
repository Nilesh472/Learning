import java.util.Arrays;

public class Containduplicate {
      public static void main(String[] args) {
            int arr[] = {1,2,3,1};
            
            System.out.println(duplicate(arr));
      }

      // static boolean duplicate(int arr[]){
      //       Arrays.sort(arr);
      //       for(int i=0; i<arr.length; i++){
      //             for(int j=i+1; j<arr.length; j++){
      //                   if(arr[i] == arr[j]){
      //                         return true;
      //                   }
      //             }
      //       }
      //       return false;
      // }

      static boolean duplicate(int arr[]){
            Arrays.sort(arr);
            for(int i=1; i<arr.length; i++){
                  if(arr[i] == arr[i-1]){
                        return true;
                  }
            }
            return false;
      }
}
