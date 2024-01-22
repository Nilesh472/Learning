public class Recursive_Triangle {
      public static void main(String[] args) {
            triangle2(5, 0);
            
      }
      // Reverse triangle
      static void triangle(int r, int c){
            if(r == 0){
                  return;
            }
            if(r>c){
                  System.out.print("*");
                  triangle(r, c+1);
            }
            else{
                  System.out.println();
                  triangle(r-1, 0);
            }
      }
      //triagnle pattern
      static void triangle2(int r, int c){
            if(r == 0){
                  return;
            }
            if(r>c){
                  triangle2(r, c+1);
                  System.out.print("*");
                  
            }
            else{
                  triangle2(r-1, 0);
                  System.out.println();
                  
            }
      }
}
