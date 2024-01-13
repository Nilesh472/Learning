public class PrimeInRange {
      public static void main(String[] args) {
            int min = 10;
            int max = 30;

            for(int i=min; i<max;i++){
                  if(checkPrime(i)){
                        System.out.println(i);
                  }
            }
            
      }

      static boolean checkPrime(int n){
            if(n==0 || n==1){
                  return true;
            }
            for(int i=2; i<n;i++){
                  if(n%i==0){
                        return false;
                  }
                  
            }
            return true;
            
      }
}
