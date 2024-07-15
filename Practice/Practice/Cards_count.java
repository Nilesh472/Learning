
public class Cards_count{
    public static void main(String[] args) {
        int n = 3;
        System.out.println(count(n));
    }

    static int count(int n){
        return 3*(3*n+1)/2;
    }
}