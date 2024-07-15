

public class Remainder_Modulo {
    public static void main(String[] args) {
        String str = "121";
        int n = str.length();
        int num = 0;
        for (int i=0; i<n; i++){
            num = num*10 + (str.charAt(i)-'0');
            }
            System.out.println(num);
            int rem = num%11;
            System.out.println(rem);
    }
}
