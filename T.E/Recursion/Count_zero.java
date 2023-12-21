public class Count_zero {
      private static int count;
      public static void main(String[] args) {
            System.out.println(countzero(302030100));
      }
      static int countzero(int n){
            return helper(n,count);
      }
      private static int helper(int n, int count){
            if(n==0){
                  return count;
            }
            int rem = n%10;
            if(rem==0){
                  return helper(n/10, count+1);
            }
            return helper(n/10, count);

      }
}
