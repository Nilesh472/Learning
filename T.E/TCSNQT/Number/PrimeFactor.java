public class PrimeFactor {
      public static void main(String[] args) {
            int n = 9;
            System.out.println("Prime factors of "+n);
            primeFactor(n);
      }

      static void primeFactor(int n){
            if(n==0 || n==1){
                  return;
            }
            for(int i=2; n>1; i++){
                  if(n%i==0){
                        while (n%i==0) {
                              System.out.print(i+" ");
                              n = n/i;
                        }
                  }
            }
      }
}
