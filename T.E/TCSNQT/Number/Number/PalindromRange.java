public class PalindromRange {
      public static void main(String[] args) {
            int min = 100;
            int max = 300;

            for(int i=min; i<max; i++){
                  if(isPalindrom(i)){
                        System.out.println(i);
                  }
            }
            
      }

      static boolean isPalindrom(int n ){
            int rev=0;
            int temp = n;
            while(temp>0){
                  rev = rev*10 + temp%10;
                  temp = temp/10;
            }
            if(rev == n){
                  return true;
            }
            return false;
      }
}
