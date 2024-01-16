

public class Cal_FrquencyIn_String {
      public static void main(String[] args) {
            String str = "nileshuditaurvi";
            calculateFrquency(str);
            // cal_Fruency(str);
      }
      static void calculateFrquency(String str){
            str = str.toLowerCase();
            boolean[] visited = new boolean[str.length()];

            for(int i=0; i<str.length(); i++){
                  char ch = str.charAt(i);
                  if(visited[i] == true){
                        continue;
                  }
                  int count=1;
                  for(int j=i+1; j<str.length();j++){
                        if(ch == str.charAt(j)){
                              visited[j] = true;
                              count++;
                        }
                  }
                  System.out.print(ch +" "+ count);
            }
      }

      // static void cal_Fruency(String str){
      //       char c[] = str.toCharArray();
      //       Arrays.sort(c);
      //       String str1 = new String(c);
      //       int ch = str1.charAt(0);
      //       int count=1;
      //       for (int i = 1; i < str1.length(); i++) {
      //             if(str1.charAt(i)==ch){
      //                   count++;
      //             }
      //             else{
      //                   System.out.println(ch + " "+ count);
      //                   ch = str1.charAt(i);
      //                   count=1;
      //             }
                  
      //             System.out.print(ch+" "+count);
      //       }


      // }
}
