public class Reverse {
      public static void main(String[] args) {
            String str = "nileshkumaraabb";
            String rev = "";

            int len = str.length();

            for(int i=0; i<len;i++){
                  rev = str.charAt(i) + rev;
            }
            System.out.println(rev);

            // checking palindrome
            if(str == rev){
                  System.out.println("String is palindrome");
            }
            else{
                  System.out.println("String is not palindrome");
            }

            // Occurrence of character
            int count = 0;
            char search = 'a';
            for (int j = 0; j < len; j++) {
                  if(str.charAt(j) == search){
                        count++;
                  }
            }
            System.out.println(count);
      }

}
