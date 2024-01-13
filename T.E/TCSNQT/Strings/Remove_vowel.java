public class Remove_vowel {
      public static void main(String[] args) {
            String str = "Nilesh kumar Yadav";
            removeVowel(str);
            
            // System.out.println(RemoveVowels(str));
      }

      static void removeVowel(String str){
            
            str = str.toLowerCase();
            for(int i=0; i<str.length(); i++){
                  char ch = str.charAt(i);
                  if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                        str = str.substring(0,i) + str.substring(i+1);
                        i--;
                  }
            }
            str = str.toUpperCase();
            System.out.println(str);
      }

      // public static String RemoveVowels(String str) {
      //       for (int i = 0; i < str.length(); i++) {
      //         if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
      //           str = str.substring(0, i) + str.substring(i + 1);
      //           i--;
      //         }
      //       }
      //       return str;
      //     }
}
