public class Remove_Space {
      public static void main(String[] args) {
            String str = "Nilesh kumar Yadav";
            System.out.println(removeSpace(str));
      }

      static String removeSpace(String str){
            
            
            for(int i=0; i<str.length(); i++){
                  char ch = str.charAt(i);
                  if(ch==' '){
                        
                        str = str.substring(0, i) + str.substring(i + 1);
                        i--;
                  }
            }
            return str;
      }
}
