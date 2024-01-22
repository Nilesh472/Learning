public class Increasing_Number_Triangle {
      public static void main(String[] args) {
            int n=5; 
            int count = 1;

            for(int i=0; i<n; i++){
                  for(int j=0; j<=i; j++){
                        System.out.print(count+" ");
                        count++;
                  }
                  System.out.println();
            }
      }
}
