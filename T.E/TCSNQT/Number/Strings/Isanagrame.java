import java.util.Arrays;

public class Isanagrame {
      public static void main(String[] args) {
            String str1 = "silent";
            String str2 = "listen";
            System.out.println(checkAnagram(str1, str2));
            
      }

      static boolean checkAnagram(String str1, String str2){
            boolean anagaram;
            if(str1.length() != str2.length()){
                  return false;
            }

            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            anagaram = Arrays.equals(ch1, ch2);
            if(anagaram==true){
                  return true;
            }
            return false;
      }
}
