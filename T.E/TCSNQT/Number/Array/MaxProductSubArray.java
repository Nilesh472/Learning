public class MaxProductSubArray {
      public static void main(String[] args) {
            int arr[] = {1,2,-3,0,-4,-5};
            System.out.println(maxProduct(arr));
      }

      static int maxProduct(int arr[]){
            int ans = Integer.MIN_VALUE;
            int pro1 = arr[0];
            int pro2 = arr[0];

            for(int i=1; i<arr.length; i++){
                  int temp = Math.max(arr[i], Math.max(pro1*arr[i], pro2*arr[i]));
                  pro2 = Math.min(arr[i], Math.min(pro1*arr[i], pro2*arr[i]));
                  pro1 = temp;
                  ans = Math.max(ans, pro1);
            }
            return ans;
      }
}
