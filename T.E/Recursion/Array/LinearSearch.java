public class LinearSearch {
      public static void main(String[] args) {
            int[] arr = {2,5,1,7,9};
            System.out.println(Indexsearch(arr, 1, 0));
            System.out.println(search(arr, 1, 0));
      }
      static boolean search(int[] arr, int target, int index){
            if(index == arr.length){
                  return false;
            }
            return arr[index] == target || search(arr, target, index+1);
      }

      static int Indexsearch(int[] arr, int target, int index){
            if(index == arr.length-1){
                  return -1;
            }
            if(arr[index] == target){
                  return index;
            }
            return Indexsearch(arr, target, index+1);
      }

}
