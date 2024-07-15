import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your password");
            String password = sc.nextLine();
            int n = password.length();
            System.out.println(checkPassword(password, n));
        }

    }
    static int checkPassword(String str, int n){
        if(n<4){
            return 0;
        }
        if(str.charAt(0) >= '0' && str.charAt(0) <= '9'){
            return 0;
        }
        int num = 0;
        int upper = 0;
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                upper++;
            }
            if(ch >= '0' && ch <= '9'){
                num++;
            }
            if(ch ==' ' || ch == '/'){
                return 0;
            }

        }
        if(num >0 && upper >0){
            return 1;
        }
        return 0;
    }
    
}
