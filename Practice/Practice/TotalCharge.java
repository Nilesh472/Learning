public class TotalCharge {
    public static void main(String[] args) {
        int arr[] = {3,5,5};
        char charge[] = {'p', 'n', 'p'};
        int sum = totalCharge(arr, charge);
        System.out.println(sum);
    }
    public static int totalCharge(int arr[], char charge[]) {
        int n = arr.length;
        int total = 0;
        for(int i=0; i<n; i++){
            if(charge[i] == 'p'){
                total += arr[i];
            }
            else{
                total -= arr[i];
            }
        }
        if(total > 0){
            total = total * 100;
        }
        else{
            total = total * -100;  
        }    
        return total;
    }
}
