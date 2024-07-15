


public class UpperLower {
    public static void main(String[] args) {
        String str = "Hello World";
        int upper = 0;
        int lower = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            }
            if (ch >= 'a' && ch <= 'z'){
                lower++;
            }
        }
        if(upper>lower){
            System.out.println(str.toUpperCase());
        }
        else{
            System.out.println(str.toLowerCase());
        }
    }
}
