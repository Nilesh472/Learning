public class Permutation_count {
    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        int count = permutation_count(str, n);
        System.out.println(count);
    }
    static int permutation_count(String str, int n){
        if(n==0){
            return 1;
        }
        return n*(n-1);
    }
}
