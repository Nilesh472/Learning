import java.util.ArrayList;
import java.util.Arrays;

public class Containduplicate {
      public static void main(String[] args) {
            int arr[] = {1,2,3,1,1};
            int n = arr.length;
            
            System.out.println(duplicates(arr,n));
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

      static ArrayList<Integer> duplicates(int arr[], int n){
            ArrayList<Integer> list = new ArrayList<Integer>();

		Arrays.sort(arr);

		int index = 0;

		for (int i = 0; i < n - 1; i++) {
			if (!list.isEmpty()) {
				if (arr[i] == arr[i + 1] && list.get(index) != arr[i]) {
					i = i + 1;
					list.add(arr[i]);
					index++;
				}
			} else {
				if (arr[i] == arr[i + 1]) {
					i = i + 1;
					list.add(arr[i]);
				}
			}
		}

		if(list.isEmpty()) {
			list.add(-1);
		}
		return list;

      }
}
