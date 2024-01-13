
public class Ispalindrome{
      public static void main(String[] args) {
            int n = 15351;
            reverse(n);
      }

      public static void reverse(int n){
            int sum = 0;
            int temp=n;
            while (temp!=0) {
                  sum = sum*10 + temp%10;
                  temp = temp/10;
            }
            if(sum==n){
                  System.out.println("Number is Palindrome");
            }
            else{
                  System.out.println("Number is not Palindrome");
            }
            return;
      }
}
