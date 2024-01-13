public class Vovel_Consos_Space_Count {
      public static void main(String[] args) {
            String str = "NILESH KUMAR YADAV";
            countInString(str);
      }

      static void countInString(String str){
            int n = str.length();
            int vowel_count = 0;
            int consonant_count = 0;
            int space_count = 0;
            str = str.toLowerCase();
            for(int i=0; i<n; i++){
                  char ch = str.charAt(i);
                  if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                        vowel_count++;
                  }
                  else if(ch==' '){
                        space_count++;
                  }
                  else{
                        consonant_count++;
                  }
            }
            System.out.println("Number of vowels in string: "+vowel_count);
            System.out.println("Number of Consonant in string: "+consonant_count);
            System.out.println("Number of WHite spaces in string: "+space_count);
      }
}
