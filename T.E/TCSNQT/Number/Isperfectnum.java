public class Isperfectnum {
      public static void main(String[] args) {
            int n=28;
            
            System.out.println(checkPerfect(n));
      }

      static boolean checkPerfect(int n){
            int sum=0;
            for(int i=1; i<n; i++){
                  if(n%i==0){
                        sum = sum+i;
                  }
            }
            if(n==sum){
                  return true;
            }
            return false;
      }
       
}