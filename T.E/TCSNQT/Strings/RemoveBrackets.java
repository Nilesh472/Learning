public class RemoveBrackets {
      public static void main(String[] args) {
            String str = "a+((b-c)+d)";
            System.out.print(removeBracks(str));
            System.out.println("\n"+usingStringBuilder(str));
      }

      static String removeBracks(String str){
            for(int i=0; i<str.length(); i++){
                  if(str.charAt(i) == '(' || str.charAt(i) == ')'){
                        str = str.substring(0,i) + str.substring(i+1);
                        i = 0;
                  }
            }
            return str;
      }

      //using string builder
      static String usingStringBuilder(String str){
            StringBuilder answer = new StringBuilder();
            for(int i=0; i< str.length(); i++){
                  char ch = str.charAt(i);
                  if(ch != '(' && ch != ')'){
                        answer = answer.append(ch);
                  }
            }
            return answer.toString();
      }
}
