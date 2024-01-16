public class ConcatArray {
      public static void main(String[] args) {
            int[] arr = {1,2,3};
            getConcat(arr);   
            
      }

      static void getConcat(int[] arr){
            int n = arr.length;
            int[] ans = new int[2*n];

            for(int i=0; i<arr.length; i++){
                  ans[i] = arr[i];
                  ans[i+n] = arr[i];
            }
            for(int i=0; i<ans.length; i++){
                  System.out.print(ans[i] +" ");
            }
            return;
      }
}
