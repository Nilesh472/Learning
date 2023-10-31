public class SeachInArray {
      public static void main(String[] args) {
            
            int[] arr = {24,245,23,12,13,56};
            int target = 13;
            int ans1 = linearSearch(arr,target);
            System.out.println(ans1);
            int ans2 = linearSearch2(arr,target);
            System.out.println(ans2);
            boolean ans3 = linearSearch3(arr,target);
            System.out.println(ans3);
      }
      //Search in the array: return the index if array found
      // otherwise if item not found return -1

      static int linearSearch(int[] arr, int target){
            if(arr.length == 0){
                  return -1;
            }
            // run a for loop
            for(int index=0;index<arr.length;index++){
                  //check for element at every index if it is target 
                  int element = arr[index];
                  if (element == target){
                        return index;
                  }
            }
            return -1;
      }
      //Search in array and return element in the array 
      static int linearSearch2(int[] arr, int target){
            if(arr.length == 0){
                  return -1;
            }
            // run a for loop
            for(int index=0;index<arr.length;index++){
                  //check for element at every index if it is target 
                  int element = arr[index];
                  if (element == target){
                        return element;
                  }
            }
            return -1;
      }
      //If target found return true otherwise false

      static boolean linearSearch3(int[] arr, int target){
            if(arr.length == 0){
                  return false;
            }
            // run a for loop
            for(int index=0;index<arr.length;index++){
                  //check for element at every index if it is target 
                  int element = arr[index];
                  if (element == target){
                        return true;
                  }
            }
            return false;
      }
      
}
