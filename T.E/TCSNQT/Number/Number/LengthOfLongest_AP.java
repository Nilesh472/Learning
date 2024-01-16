public class LengthOfLongest_AP {
      public static void main(String[] args) {
            int ar[] = {1, 7, 10, 13, 14, 19};
            System.out.println(CuntLengthOfAP(ar));
      }

      static int CuntLengthOfAP(int arr[]){
            int count=0;
            int d = arr[1] - arr[0];

            for(int i=0; i<arr.length; i++){
                  for(int j=i+1; j<arr.length; j++){
                        if(arr[j] - arr[i] == d){
                              count++;
                        }
                  }
            }
            return count;
      }
}
