public class Lexicographic_Alphabet {
      public static void main(String[] args) {
            String str = "abcABZ";
            System.out.println(shift_Character(str));

      }
      // leticographic means a->b, n->m , z->a; shift character to next character 

      static String shift_Character(String str){
            StringBuilder ans = new StringBuilder();
            int n = str.length();

            for(int i=0; i<n; i++){
                  int ch = (int) str.charAt(i);
                  
                  if (ch == 90) {
                        ans.append((char) 65 );
                  }
                  else if (ch == 122) {
                        ans.append((char) 97 );
                  }
                  else if((ch>=65 && ch<90) || (ch>=97 && ch<122)){
                        ans.append((char) (ch+1));
                  }
            }
            return ans.toString();
      }
}
