public class Palindrom {
      public static void main(String args[]){
            String str = "abcba";
            System.out.println(ispalindrom(str));
            System.out.println(ispalindrom2(str));

      }

      static boolean ispalindrom(String str){
            if(str == null || str.length() == 0){
                  return true;
            }
            str = str.toLowerCase();
            for(int i=0; i<=str.length()/2; i++){
                  char start = str.charAt(i);
                  char end = str.charAt(str.length()-1-i);

                  if(start != end){
                        return false;
                  }
            }
            return true;
      }

      static boolean ispalindrom2(String str){
            String rev="";
            int n = str.length();

            for (int index = 0; index < n; index++) {
                  rev = str.charAt(index) + rev;   
            }
            if(str.equals(rev)){
                  return true;
            }
            return false;
      }
}

