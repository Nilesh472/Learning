public class SearchInRange {
      public static void main(String[] args) {
            int[] arr = {24,245,23,12,13,56};
            int target = 13;
            int ans1 = linearSearch(arr,target,0,5);
            System.out.println(ans1);
      
}

      static int linearSearch(int[] arr, int target, int start, int end){
            if(arr.length == 0){
                  return -1;
            }
            // run a for loop
            for(int index=start;index<end;index++){
                  //check for element at every index if it is target 
                  int element = arr[index];
                  if (element == target){
                        return index;
                  }
            }
            return -1;
      }
}