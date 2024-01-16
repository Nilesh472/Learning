public class HarshadNumber {
      public static void main(String[] args) {
            //TC = O(N) SC = O(1)
            int n = 379;
            int temp = n;
            int sum = 0;
            while(n>0){
                  int r = n%10;
                  sum += r;
                  n = n/10;
            }
            if(temp%sum==0){
                  System.out.println("yes it is Harshad number");
            }
            else{
                  System.out.println("It is not a Harshad number");
            }
      }
}
