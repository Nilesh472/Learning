public class Merge_Two_String {
      public static void main(String[] args) {
            String str1 = "hel0";
            String str2 = "world";
            mergeTwoString(str1, str2);
      }

      static void mergeTwoString(String str1, String str2){
            int n1 = str1.length();
            int n2 = str2.length();

            char ch1[] = str1.toCharArray();
            char ch2[] = str2.toCharArray();

            char ch3[] = new char[n1+n2];
            int n = ch3.length;

            for(int i=0; i<n1; i++){
                  ch3[i] = ch1[i];
                  i+2;
            }
            for(int i=1; i<n2; i++){
                  ch3[i] = ch2[i];
                  i+2;
            }
            System.err.println(new String(ch3));
           
            
      }
}
