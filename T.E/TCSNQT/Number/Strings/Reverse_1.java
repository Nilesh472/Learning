public class Reverse_1 {
      public static void main(String[] args) {
            String str = "Nilesh";
            System.out.println(Newreverse(str));
      }

      static String Newreverse(String str){
            String rev = " ";
            
            for(int i=0; i<str.length(); i++){
                  rev = str.charAt(i) + rev;
            }
            return rev;

      }
}
