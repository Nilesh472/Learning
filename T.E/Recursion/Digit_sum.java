public class Digit_sum {
      public static void main(String[] args) {
            int ans = Product(22);
            System.out.println(ans);
      }

      static int sumOfDigit(int n){
            if(n==0){
                  return 0;
            }
            return (n%10)+sumOfDigit(n/10);
      }

      static int Product(int n){
            if(n%10==n){
                  return n;
            }
            return (n%10)*(n/10);
      }
}
