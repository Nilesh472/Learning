 public class MaxOccuring_Element {
      public static void main(String[] args) {
            String str = "hello";
            System.out.println(maxOccuringElement(str));
      }
      static char maxOccuringElement(String str){
            int s = str.length();
            int count[] = new int[256];
            int max=0;
            char ans = str.charAt(0);

            for(int i=0; i<s; i++){
                  char ch = str.charAt(i);
                  count[ch]++;
                  if(count[ch] > max){
                        max = count[ch];
                        ans = ch;
                  }
                  
            }
            return ans;
      }
}
