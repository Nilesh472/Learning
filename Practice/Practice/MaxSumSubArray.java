public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, -8};
        int maxSum = maxSumSubArray(arr);
        System.out.println(maxSum);
    }
    static int maxSumSubArray(int arr[]){
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
            if(sum > max){
                max = sum;
            }
            if(sum<0){
                sum = 0;
            }
            
        }
        return max;
    }
}
