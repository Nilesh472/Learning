public class Sorting {
      public static void main(String[] args) {
            int arr[] = {7,8,3,1,2};
            bubbleSort(arr);
            selectionSort(arr);
            insertionSort(arr);
      }
      //Bubble sort TC -> O(n^2)
      static void bubbleSort(int arr[]){
            int n = arr.length;
            for(int i=0; i<n-1; i++){
                  for(int j=0; j<n-1-i; j++){
                        if(arr[j]>arr[j+1]){
                             Swap(arr, j, j+1); 
                        }
                  }
            }
            for(int i=0; i<n; i++){
                  System.out.print(arr[i] +" ");
            }
            System.out.println();
      }
      //Selection sort TC -> O(n^2)
      static void selectionSort(int arr[]){
            for(int i=0; i<arr.length; i++){
                  int small = i;
                  for(int j=i+1; i<arr.length;i++){
                        if(arr[small]>arr[j]){
                              Swap(arr, small, j);
                        }
                  }
            }
            for(int i=0; i<arr.length; i++){
                  System.out.print(arr[i] +" ");
            }
            System.out.println();
      }

      static void insertionSort(int arr[]){
            // i represent unsorted side of array
            for(int i=1; i<arr.length; i++){  
                  int current = arr[i]; 
                  // j represent sorted side of array 
                  int j=i-1;
                  while(j>=0 && current<arr[j]){
                        arr[j+1] = arr[j];
                        j--;
                  }
                  arr[j+1] = current;
            }
            for(int i=0; i<arr.length; i++){
                  System.out.print(arr[i] +" ");
            }
            System.out.println();
            
      }
      static void Swap(int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
      }
}
