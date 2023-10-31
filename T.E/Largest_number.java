import java.util.*;
public class Largest_number {
      public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a>b && b>c){
                  System.out.println("Largest number is: "+a);
            }
            else if(b>a && a>c){
                  System.out.println("Largest number is: "+b);
            }
            else{
                  System.out.println("Largest number is: "+c );
            }
      }
      
}
