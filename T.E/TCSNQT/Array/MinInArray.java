
public class MinInArray {
      public static void main(String[] args) {
            int arr[] = {2,3,4,5,61,1};
            System.out.println(Min_num(arr));
      }
      public static int Min_num(int arr[]){
            int min = arr[0];
            for(int i=0;i<arr.length;i++){
                  if(arr[i]<min){
                        min = arr[i];
                  }
            }
            return min;
      }
}
      
            
