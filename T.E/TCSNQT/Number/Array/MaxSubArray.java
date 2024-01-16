public class MaxSubArray {
      public static void main(String[] args) {
            int[] arr = {1,2,-3,0,-4,-5};
            int ans = maxSubarray(arr);

            
            System.out.print(ans);
      }

      static int maxSubarray(int[] arr){
            int max = Integer.MIN_VALUE;
            int sum = 0;
            for(int i=0; i<arr.length; i++){
                  sum += arr[i];
                  if(sum>max){
                        max = sum;
                  }
                  if(sum<0){
                        sum = 0;
                  }
            }
            return max;
      }

      static int minSubarray(int[] arr){
            int min = Integer.MAX_VALUE;
            int sum=0;

            for(int i=0; i<arr.length; i++){
                  sum += arr[i];
                  if(sum<min){
                        min = sum;
                  }
                  if(sum>0){
                        sum=0;
                  }
            }
            return min;
      }

      
      
}
