public class GreatestOfNumber {
      public static void main(String[] args) {
            int a = 15;
            int b = 19;
            int c = 20;
            System.out.println(twoNumber(a, b));
            System.out.println(threeNumber(a, b, c));

      }
      static int twoNumber(int a, int b){
            int result;
            if(a>b){
                  System.out.println("a is greater");
                  result=a;
            }
            else{
                  System.out.println("b is greater");
                  result=b;
            }
            return result;
      }

      static int threeNumber(int a, int b, int c){
            int result;
            if(a>b && a>c){
                  System.out.println("a is greater");
                  result=a;
            }
            if(b>a && b>c){
                  System.out.println("b is greater");
                  result=b;
            }
            else{
                  System.out.println("c is greater");
                  result=c;
            }
            return result;
      }
      
}
