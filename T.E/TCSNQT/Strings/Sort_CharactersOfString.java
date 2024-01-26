public class Sort_CharactersOfString {
      public static void main(String[] args) {
            String str = "hello";
            int n = str.length();
            char[] arr = str.toCharArray();
            // bubble sort
            for (int i = 0; i < n - 1; i++) {
              for (int j = 0; j < n - i - 1; j++) {
                // swap
                if (arr[j] > arr[j + 1]) {
                  char temp = arr[j];
                  arr[j] = arr[j + 1];
                  arr[j + 1] = temp;
                }
              }
            }
            String ans = new String(arr);
            System.out.println(ans);
          
      }
}