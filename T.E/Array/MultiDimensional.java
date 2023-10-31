import java.util.*;
public class MultiDimensional{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[][] arr = new int[3][3];

            System.out.println(arr.length);

            for(int row=0;row<arr.length;row++){
                  //for each col in every row
                  for(int col=0;col<arr[row].length;col++){
                        arr[row][col] = sc.nextInt();
                  }
            }
            System.out.println("Output");

            // for(int row=0;row<arr.length;row++){
            //       //for each col in every row
            //       for(int col=0;col<arr[row].length;col++){
            //             System.out.print(arr[row][col] + " ");
            //       }
            //       System.out.println();
            // }
            for(int row=0;row<arr.length;row++){
                  System.out.println(Arrays.toString(arr[row]));
            }
            sc.close();
            
            
      }

            
}
      
