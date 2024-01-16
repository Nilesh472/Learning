public class Permutation {
      public static void main(String[] args) {
            int n = 5;
            int r = 3;
            double ans = cal_Permutation(n, r);
            System.out.println(ans);
      }

      static  double cal_Permutation(int n , int r){
            double perm = fact(n)/fact(n-r);
            return perm;
      }
      static int fact(int n){
            if(n==0) return 1;
            if(n==1) return 1;

            return n*fact(n-1);
      }
}
