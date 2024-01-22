public class Number_Crown_Pattern {
      public static void main(String[] args) {
            int n=4;
            
            for(int i=1; i<=n; i++){
                  for(int j=1; j<=i; j++){
                        // 1st part star
                        System.out.print("*");
                  }
                  // spaces
                  int spaces = 2*(n-i);
                  for(int j=1; j<=spaces; j++){
                        System.out.print(" ");
                  }
                  // 2nd part star
                  for(int j=1; j<=i; j++){
                        System.out.print("*");
                  }
                  System.out.println();
            }
      }
}
