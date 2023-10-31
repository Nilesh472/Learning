import java.util.*;

public class Sum {
      public static void main(String[] args) {
            // sum();
            String message = greet();
            System.out.println(message);
            
            int ans = sum2(40, 30);
            System.out.println(ans);
            
      }
      // public static void sum(){
      //       Scanner sc = new Scanner(System.in);
      //       System.out.println("Enter number 1: ");
      //       int num1 = sc.nextInt();

      //       System.out.println("Enter number 2: ");
      //       int num2 = sc.nextInt();

      //       int sum = num1+num2;
      //       System.out.println("Sum of num1 and num2: "+sum);
      // }

      //integer Function with argunment and return type
      static int sum2(int a, int b){
            int sum = a + b;
            return sum;
      }

      // String funtion with return type
      static String greet(){
            String greeting = "Hello Nilesh";
            return greeting;

      }
      
}
