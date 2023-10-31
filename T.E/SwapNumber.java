public class SwapNumber {
      public static void main(String[] args) {
            int a = 20;
            int b = 30;

            // int temp = a;
            // a = b;
            // b = temp;
            int ans = swap(a,b);
            System.out.println(ans);
      }
      static int swap(int a,int b){
            int temp = a;
            a = b;
            b = temp;
            System.out.println("Swapped"+a+" "+b);
            return 0;
            
            

      }
      
}
