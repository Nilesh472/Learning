public class MaxInArray {
    public static void main(String[] args) {
        int arr[] = {23,45,82,278,66,12,78,13,71,86};
        int n = arr.length; 
        maxInArray(arr, n);
    }
    static void maxInArray(int arr[], int n){
        int max = arr[0];
        int index = 0;
        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        System.out.println("Max element is " + max + " at index "+ index);
    }
}
