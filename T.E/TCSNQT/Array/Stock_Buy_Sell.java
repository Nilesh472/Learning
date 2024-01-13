public class Stock_Buy_Sell {
      public static void main(String[] args) {
            int arr[] = {7,1,5,3,6,4};
            int ans = maxProfit(arr);
            System.out.println(ans);
      }

      static int maxProfit(int arr[]){
            int max = 0;
            int min = arr[0];

            for(int i=1; i<arr.length; i++){
                  int current_max = arr[i] - min;
                  if(current_max>max){
                        max = current_max;
                  }
                  if(arr[i] < min){
                        min = arr[i];
                  }
            }
            return max;
      }
}
