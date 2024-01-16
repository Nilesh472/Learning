public class TwoSum {
      public static void main(String[] args) {
            int arr[] = {2,6,5,8,11};
            int target = 14;
            int sum;
            for(int i=0; i<arr.length; i++){
                  for(int j=i+1; j<arr.length; j++){
                        sum = arr[i] + arr[j];
                        if(sum == target){
                              System.out.println(i +" "+ j);
                        }
                  }
            }
      }
}
