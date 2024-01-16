public class Non_Repeating {
      public static void main(String[] args) {
            int arr[] = {1,1,1,2,3,4,4,5};
            printRepeating(arr);
      }

      static void printNonRepeating(int[] arr){
            int n = arr.length;

            for(int i=0; i<n-1; i++){
                  if(arr[i] == arr[i+1]){
                        i++;
                  }
                  else{
                        System.out.println(arr[i]);
                  }
            }
      }

      static void printRepeating(int arr[]){
            int count=0;
            int[] ans = new int[arr.length];

            for(int i=0; i<arr.length-1; i++){
                  if(arr[i] == arr[i+1]){
                        ans[count++] = arr[i];
                  }
            }
            for(int j=0; j<count; j++){
                  if(ans[j] != ans[j+1]){
                        System.out.println(ans[j]+" ");
                  }
            }
      }
}
