import java.util.*;

public class ThreeSum {
      public static void main(String[] args) {
            
      }

      static ArrayList<Integer> threeSum(int arr[]){
            int n = arr.length;
            ArrayList<List<Integer>> list = new ArrayList<>();

            for(int i=0; i<n; i++){
                  for(int j=i+1; j<n; j++){
                        for(int k=j+1; k<n; k++){
                              if(arr[i]+arr[j]+arr[k]==0){
                                    list.add(arr[k]);
                              }
                        }
                  }
            }
      }
}
