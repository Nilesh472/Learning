import java.util.*;
public class Fibo {
      public static void main(String[] args) {
            int n;

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number to find fibonacci number: ");
            n=sc.nextInt();


            int ans = fibo(n);
            System.out.println(ans);
            sc.close();
      }

      static int fibo(int n){

            //base conditon
            if(n<2){
                  return n;
            }
            
            return fibo(n-1) + fibo(n-2);
      }
}
