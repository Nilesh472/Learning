public class Symmetric_Void_Pattern {
      public static void main(String[] args) {
            int n=5;

            for(int i=n; i>=1; i--){
                  // 1st star
                  for(int j=1; j<=i; j++){
                        System.out.print("*");
                  }
                  // spaces
                  for(int j=1; j<=2*(n-i); j++){
                        System.out.print(" ");
                  }
                  //2nd star
                  for(int j=1; j<=i; j++){
                        System.out.print("*");
                  }

                  System.out.println();
            }

            for(int i=1; i<=n; i++){
                  // 1st star
                  for(int j=1; j<=i; j++){
                        System.out.print("*");
                  }
                  // spaces
                  for(int j=1; j<=2*(n-i); j++){
                        System.out.print(" ");
                  }
                  //2nd star
                  for(int j=1; j<=i; j++){
                        System.out.print("*");
                  }

                  System.out.println();
            }
      }
}
