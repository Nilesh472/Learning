public class Min_Max {
      public static void main(String[] args) {
            int[] arr = {1,5,8,9,2,5,6};
            System.out.println(Min(arr));

      }
      static int Min(int[] arr){
            int min = arr[0];
            for(int i=0;i<arr.length;i++){
                  if(arr[i]<min){
                        min = arr[i];
                  }
            
                  
            }
            return min;
      }
      
}
