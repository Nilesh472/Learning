public class Isprime {
      public static void main(String[] args) {
            int n = 44;
            System.out.println(CheckPrime(n));
      }

      public static boolean CheckPrime(int n){
            if(n==0 || n==1){
                  return false;
            }
            for(int i=2;i<n;i++){
                  if(n%i==0){
                        return false;
                  }
            }
            return true;
      }
}
