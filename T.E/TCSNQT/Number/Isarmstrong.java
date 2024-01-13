public class Isarmstrong {
      public static void main(String[] args) {
            int n = 153;
            
            System.out.println(checkArmstrong(n));
      }

      static boolean checkArmstrong(int n){
            int sum=0;
            int temp=n;

            while (temp>0) {
                  int r = temp%10;
                  sum = sum+r*r*r;
                  temp = temp/10;
            }
            if(sum==n){
                  return true;
            }
            return false;
      }
}
