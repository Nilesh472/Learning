import java.util.*;

public class MakeAnagrame {
      public static void main(String[] args) {
            String s = "leetcode";
            String t = "practice";
            System.out.println(minStep(s, t));
      }

   
      static int minStep(String str1, String str2){
            int count = 0;
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            for (int i = 0; i < ch1.length; i++) {
                  for(int j=i; j<=i; j++){
                        if(ch1[i] == ch2[j]){
                              break;
                              
                        }else{
                              count++;
                        }
                  }
            }
            
            return count;

      }
}
