public class FindCount {
    public static void main(String args[]){
        int arr[] = {13,2,1,14,135,17,12};
        int num = 13;
        int diff = 2;
        int n = arr.length;
        System.out.println(findCount(arr, num, diff, n));
    }
    static int findCount(int arr[],int num, int diff, int n){
        int count = 0;
        for(int i=0; i<n; i++){
            if(Math.abs(arr[i]-num) <= diff){
                count++;
            }
        }
        if(count > 0) return count;
        return 0;
    }
}
