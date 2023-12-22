public class Stream {
      public static void main(String[] args) {
            skip("abbabcad", "");
      }
      // Using answer parameter
      static void skip(String str, String ans){
            if(str.isEmpty()){
                  System.out.println(ans);
                  return;
            }
            char ch = str.charAt(0);
            if(ch=='a'){
                  skip(str.substring(1), ans);
            }
            else{
                  skip(str.substring(1), ans+ch);
            }
      }

      static String skip1(String str){
            if(str.isEmpty()){
                  return "";
            }
            char ch = str.charAt(0);
            if(ch == 'a'){
                  return skip1(str.substring(1));
            }
            return ch+skip1(str.substring(1));
      }
}
