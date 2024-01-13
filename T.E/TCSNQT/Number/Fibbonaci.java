public class Fibbonaci {
      public static void main(String[] args) {
            int n = 6;
            fiboSeries(n);
            // fibo using swapping 
            if(n==0){
                  System.out.println("0");
            }
            int first = 0;
            int second = 1;
            System.out.print(first+" "+second+" ");
            int sum;
            for(int i=2; i<=n; i++){
                  sum = first + second;
                  first = second;
                  second = sum;
                  System.out.print(sum+" ");

            }
            

            
      }
      //using recursion
      static int fibbo(int n){
            if(n<2){
                  return n;
            }
            return(fibbo(n-1) + fibbo(n-2));
      }


      //using Array
      static void fiboSeries(int n){
            if(n==0){
                  System.out.println("0");
            }
            
                  int[] fib = new int[n+1];

                  fib[0] = 0;
                  fib[1] = 1; 

                  for(int i=2; i<=n; i++){
                        fib[i] = fib[i-1] + fib[i-2];
                  }
            
            for(int i=0;i<=n;i++){
                  System.out.print(fib[i]+" ");
            }
            
      }
}
