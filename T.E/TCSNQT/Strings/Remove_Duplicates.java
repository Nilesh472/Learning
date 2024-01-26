

public class Remove_Duplicates {
      public static void main(String[] args) {
            String str = "hellohello";
            
            System.out.print(removeDuplicates(str));
      }

      static String removeDuplicates(String str){
            String result = " ";

            for(int i=0; i<str.length(); i++){
                  char ch = str.charAt(i);
                  int j=0;
                  for(j=0; j<i; j++){
                        if(ch == str.charAt(j)){
                              break;
                        }
                  }
                  if(i==j){
                        result = result+ch;
                  }
            }
            return result;
      }
}
