public class AlikeString {
      public static void main(String[] args) {
            String str = "book";
            System.out.println(twoHalavesAreAlike(str));
      }

      static boolean twoHalavesAreAlike(String str){
            int count1 = 0;
            int count2 = 0;
            int n = str.length();
            str = str.toLowerCase();

            for(int i=0; i<str.length()/2; i++){
                  if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                        count1++;
                  }
            }
            for(int j=(n/2); j<n; j++){
                  if(str.charAt(j)=='a' || str.charAt(j)=='e' || str.charAt(j)=='i' || str.charAt(j)=='o' || str.charAt(j)=='u'){
                        count2++;
                  }
            }
            if(count1==count2){
                  return true;
            }
            return false;

      }
}