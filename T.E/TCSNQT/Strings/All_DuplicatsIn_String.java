public class All_DuplicatsIn_String {
      public static void main(String[] args) {
            String str = "sinstriiintng";
            printAllDupliuces(str);
      }

      static void printAllDupliuces(String str){
            
            boolean[] visited = new boolean[str.length()];

            for(int i=0; i<str.length(); i++){
                  char ch = str.charAt(i);
                  if(visited[i]==true){
                        continue;
                  }
                  int count = 1;
                  for(int j=i+1; j<str.length(); j++){
                        if(ch == str.charAt(j)){
                              visited[j] = true;
                              count++;
                        }
                  }
                  if(count>1){
                        System.out.println(ch + " " + count);
                  }
            }
      }
}
