public class RemoveCharacter {
      public static void main(String[] args) {
            String str = "take12% *&u ^$#forward";
            System.out.print(removeCharacter(str));
      }

      static String removeCharacter(String str){
            StringBuilder ans = new StringBuilder();

            str = str.toLowerCase();

            for(int i=0; i<str.length(); i++){
                  if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                        ans = ans.append(str.charAt(i));
                  }
            }
            return ans.toString();
      }
}
