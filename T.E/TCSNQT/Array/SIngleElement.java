public class SIngleElement {
      public static void main(String[] args) {
            int[] arr = {34,1,2,3,2,1,2,34,1,34};
            int n = arr.length;
            singleElemment(arr, n);
            //CountFrequency(arr, n);
      }
      static void singleElemment(int[] arr, int n){
            boolean[] visited = new boolean[n];
            for(int i=0; i<n; i++){
                  if(visited[i] == true){
                        continue;
                  }
                  int count = 1;
                  for(int j=i+1; j<n; j++){
                        if(arr[i] == arr[j]){
                              visited[j] = true;
                              count++;
                        }
                  }
                  if(count == 1){
                        System.out.println(arr[i]);
                  }
            }
      }

    
}


