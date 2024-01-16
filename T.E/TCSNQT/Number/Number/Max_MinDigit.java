public class Max_MinDigit {
      public static void main(String[] args) {
            int n = 1234;
            minmaxDigit(n);
      }
      static void minmaxDigit(int n){
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int r;
            while(n>0){
                  r = n%10;
                  if(max<r){
                        max = r;
                  }
                  if(min>r){
                        min = r;
                  }
                  n = n/10;
            }
            System.out.println(max);
            System.out.println(min);
            return;
      }
}
