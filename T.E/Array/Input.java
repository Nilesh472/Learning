import java.util.*;
public class Input {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[5];
            //To enter the element in array

            for(int i=0;i<arr.length;i++){
                  arr[i] = sc.nextInt();
            }

            //To print the element of an array
            for (int element : arr) { //for every element in array, print the element
                  System.out.print(element + " "); //here element represent elements of an array

            }
            // System.out.println(arr[5]);// index outofbound error
            sc.close();
      }
      
}
