public class SumOfDigit {
      public static void main(String[] args) {
            int n = 123;
            System.out.println(digitSum(n));
      }

      static int digitSum(int n){
            int sum = 0;
            while(n>0){
                  int r = n%10;
                  sum += r;
                  n = n/10;
            }
            return sum;
      }
}
