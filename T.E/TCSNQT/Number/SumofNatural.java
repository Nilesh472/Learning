import java.util.Scanner;

public class SumofNatural {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            int sum = sum(n);
            System.out.println(sum);
            sc.close();
      }

      static int sum(int n){
            int sum=0;
            for (int i = 1; i <+ n; i++) {
                  sum += i;
            }
            return sum;
      }
}
