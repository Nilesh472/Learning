public class PowerOfNumber {
      public static void main(String[] args) {
            System.out.println(powerOf(5, 3));
      }

      static int powerOf(int n, int k){
            int ans=1;
            for (int i=0; i<k; i++) {
                  ans *= n;
            }
            return ans;
      }
}
