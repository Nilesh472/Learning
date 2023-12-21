public class Binary_search {
      public static void main(String[] args) {
            int[] arr = {1,2,4,6,9,10};
            int target = 10;
            System.out.println(search(arr, target, arr[0], arr.length-1));
      }

      static int search(int[] arr, int target, int s, int e){
            if(s>e){
                  return -1;
            }
            int m = s+(e-s)/2;
            if(target == arr[m]){
                  return m;
            }
            if(target>arr[m]){
                  return search(arr, target, m+1, e);
            }
            return search(arr, target, s, m-1);
      }
}
