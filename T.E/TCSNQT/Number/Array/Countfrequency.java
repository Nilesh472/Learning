public class Countfrequency{
      public static void main(String[] args) {
            int[] arr = {2,4,6,1,2,6,4,5,4};
            int n = arr.length;
            CountNumFreq(arr, n);
            System.out.println();
            
            String str = "nileshyadav";
            int s = str.length();
            CountStrFreq(str,s);

          
      }
      static void CountNumFreq(int[] arr, int n){
            boolean[] visited = new boolean[n];
            for(int i=0; i<n; i++){
                  if(visited[i]==true){
                        continue;
                  }
                  int count=1;
                  for (int j = i+1; j < n; j++) {
                        if(arr[i]==arr[j]){
                              visited[j] = true;
                              System.out.println(arr[i]);
                        }
                  }
                  System.out.println(arr[i]+" "+count);
            }
      }
      static void CountStrFreq(String str, int n){
            boolean visited[] = new boolean[n];
            for (int i = 0; i < n; i++) {
                  char ch = str.charAt(i);
                  if(visited[i]==true){
                        continue;
                  }
                  int count=1;
                  for (int j = i+1; j < n; j++) {
                        if(ch==str.charAt(j)){
                              visited[j]=true;
                              count++;
                        }
                  }
                  System.out.println(ch+" "+count);
            }
      }

}