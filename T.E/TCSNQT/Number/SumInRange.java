public class SumInRange {
      public static void main(String[] args) {
            int num1 = 10;
            int num2 = 20;
            int sum=0;

            //TC o(N) 
            for(int i=num1; i<=num2; i++){
                  sum += i;
            }
            System.out.print("Sum of number in range: " + sum + "\n");

            //Optimised TC o(1)
            int ans = num2*(num2+1)/2 - (num1*(num1-1)/2);
            System.out.println(ans);
      }
      
}
