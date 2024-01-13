public class Factorial {
      public static void main(String[] args) {
            int n = 5;
            int fac = 1;
            if(n<2){
                  System.out.println(1);
            }
            else{
                  for(int i=1; i<=n; i++){
                        fac = fac*i;
                  }
                  System.out.println(fac+" ");
            }
            System.out.println(fact(n));
      }

      static int fact(int n){
            if(n<2){
                  return 1;
            }
            return n*fact(n-1);
      }
}
