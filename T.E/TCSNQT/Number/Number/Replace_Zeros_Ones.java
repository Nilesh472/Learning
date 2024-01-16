public class Replace_Zeros_Ones {
      public static void main(String[] args) {
            int n = 2301;
            System.out.println(replaceZeroToOne(n));
      }

      static int replaceZeroToOne(int n ){
            int ans=0;
            int mul = 1;
            while (n>0) {
                 int r = n%10;
                 if(r==0){
                  r=1;
                 } 
                 ans = mul*r + ans;
                 n = n/10;
                 mul = mul*10;
            }
            return ans;
      }
}
