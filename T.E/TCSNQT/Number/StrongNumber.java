public class StrongNumber {
      public static void main(String[] args) {
            int n = 145;
            System.out.println(strong(n));
            // TC = O(m*n) and SC = O(1)
            
      }

      static boolean strong(int n){
            int m = n;
            int sum = 0;
            while (n!=0) {
                  int r = n%10;
                  sum += fact(r);
                  // System.out.println(sum);
                  n = n/10;
            }
            if(m==sum){
                  return true;
            }
            return false;

      }

      static int  fact(int n){
            int fact = 1;
            for(int i=1; i<=n; i++){
                  fact = fact*i;
            }
            return fact;
      }
}
