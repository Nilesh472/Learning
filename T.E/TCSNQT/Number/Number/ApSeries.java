public class ApSeries {
      public static void main(String[] args) {
            
            System.out.println(Series(4, 2, 2));
      }

      static double Series(int n, double a, double d){
            if(n==0){
                  return 0;
            }
            double sum = (n/2.0)*(2.0*a+(n-1)*d);
            return sum;
      }
}
