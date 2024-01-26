public class SumOfNumber {
      public static void main(String[] args) {
            String str = "1bc268";
            
            System.out.println(sumOfNumber(str));
      }

      static int  sumOfNumber(String str){
            String tempsum = "0";
            int sum = 0; 
                

            for(int i=0; i<str.length();i++){
                  char ch = str.charAt(i);
                  
                  if(Character.isDigit(ch)){
                        tempsum += ch;
                  }
                  else{
                        sum += Integer.parseInt(tempsum);
                        tempsum="0";
                  }
            }
            return sum + Integer.parseInt(tempsum);
            
      }
}
