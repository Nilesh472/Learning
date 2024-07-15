import java.util.*;
public class Braces {
    public static void main(String[] args) {
        String s = "{{}}}}";
        int open_count = 0;
        int close_count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{') {
                open_count++;
            }
            else if (s.charAt(i) == '}') {
                    close_count++;
            }
        }
        if (open_count == close_count) {
            System.out.println("Successfully_RUn");
        } else{
            System.out.println("Compilation_error");
            }
        UsingStack(s);
    }
    static void UsingStack(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == '{'){
                st.push('{');
            }
                else if(s.charAt(i) == '}')
                {
                    if(st.isEmpty())
                    {
                        System.out.println("Compilation_error");
                        return;
                    }
                st.pop();
            }
        }
        if(st.isEmpty()){
            System.out.println("Successfully_RUn");
        }else{
            System.out.println("Compilation_error");                     
        }
    }
}
