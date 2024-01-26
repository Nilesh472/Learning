import java.util.*;
public class Concate_String {
      public static void main(String[] args) {
            String str = "hello";
            String str2 = "World";
            String newString = str.concat(str2);
            System.out.println(newString);
            System.out.println();
            concateString4(str, str2);
      }

      static void concateString1(String str1, String str2){
            System.out.println(str1.concat(str2));
      }

      static void concateString2(String str1, String str2){
            System.out.println(str1 + str2);
      }

      static void concateString3(String str1, String str2){
            StringBuilder stb = new StringBuilder(str1);
            System.out.println(stb.append(str2));
      }

      static void concateString4(String str1, String str2){
            
      }
}
