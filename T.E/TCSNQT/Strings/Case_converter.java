public class Case_converter {
      public static void main(String[] args) {
            String str = "hELLO nILESH";
            System.out.println(change_Case_ofCharacter2(str));
      }
      static String change_Case_ofCharacter(String str){
            StringBuilder ans = new StringBuilder();

            for(int i=0; i<str.length(); i++){
                  int ascii = (int) str.charAt(i);
                  if(ascii>=65 && ascii<=90){
                        ans.append((char) (ascii+32));
                  }
                  else if(ascii>=97 && ascii<=122){
                        ans.append((char) (ascii-32));
                  }
                  else{
                        ans.append((char)ascii);
                  }
            }
            return ans.toString();
      }

      //using built-in fucntion  
      static String change_Case_ofCharacter2(String str){
            StringBuilder ans = new StringBuilder();

            for(int i=0; i<str.length(); i++){
                  int ascii = (int) str.charAt(i);
                  if(ascii>=65 && ascii<=90){
                        ans.append(Character.toLowerCase((char) (ascii+32)));
                  }
                  else if(ascii>=97 && ascii<=122){
                        ans.append(Character.toUpperCase((char) (ascii-32)));
                  }
                  else{
                        ans.append((char)ascii);
                  }
            }
            return ans.toString();
      }
}
