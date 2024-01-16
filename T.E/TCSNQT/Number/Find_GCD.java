public class Find_GCD {
      public static void main(String[] args) {
            int a = 4, b=8;
            
            System.out.print(cal_gcd(a,b));
      }
      //brute force approach
      static void cal_GCD(int a, int b){
            int gcd=1;

            for(int i=1; i<=Math.min(a,b); i++){
                  if(a%i==0 && b%i==0){
                        gcd=i;
                  }
            }
            System.out.print(gcd);
      }
      //optimal approach
      static int cal_gcd(int a, int b){
            if(b==0) return a;
            return cal_gcd(b,a%b);
      }
}
