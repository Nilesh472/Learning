public class Factorial {
      public static void main(String[] args) {
           int ans = sum(5);
           System.out.println(ans);
      }
      static int fact(int n){
            if(n<2){
                  return 1;
            }
            return n*fact(n-1);// calculating factorial 5*4*3*2*1
      }

      static int sum(int n){
            if(n<2){
                  return 1;
            }
            return n+sum(n-1);// calculating sum of n=5 5+4+3+2+1
      }
}
