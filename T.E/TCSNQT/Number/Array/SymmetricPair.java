public class SymmetricPair {
      public static void main(String[] args) {
            int arr[][] = {{1,2},{2,1},{3,4},{4,5},{5,4}};
            checkSymmetric(arr);
      }

      static void checkSymmetric(int arr[][]){
            int n = arr.length;

            for(int i=0; i<n; i++){
                  for(int j=i+1; j<n; j++){
                        if(arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0]){
                              System.out.print("(" + arr[i][1] +","+ arr[j][1]+")" );
                              break;
                        }
                  }
            }
      }
}
