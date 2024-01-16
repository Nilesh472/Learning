public class Cal_LCM {
      public static void main(String[] args) {
            int a = 8, b=4;
            int ans = find_LCM(a, b);
            System.out.println(ans);
      }

      static int find_LCM(int n1, int n2){
            int gcd=1;
            for(int i=1; i<=Math.min(n1,n2); i++){
                  if(n1%i==0 && n2%i==0){
                        gcd = i;
                  }
            }
            int lcm = (n1*n2)/gcd;
            return lcm;
      }
}
