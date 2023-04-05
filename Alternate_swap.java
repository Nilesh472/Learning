import java.util.*;
public class Alternate_swap {
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of an array: ");
            int n = sc.nextInt();
            int a[] = new int[n];
            System.out.println("Enter the number of an array");

            for(int i=0;i<n;i++){
                  a[i] = sc.nextInt();
            }
            int temp = 0;
            for(int i=0;i<n-1;i+=2){
                  temp = a[i];
                  a[i] = a[i+1];
                  a[i+1] = temp;
            }
            System.out.println("Printing Alternate swapping array: ");
            for(int i=0;i<n;i++){
                  System.out.println(a[i]);
            }


      }
      
}
