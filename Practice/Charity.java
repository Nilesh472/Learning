public class Charity {
    public static void main(String[] args) {
        int day = 3;
        int sum = 0;
        while(day != 0){
           int i = day;
            sum += i*i;
            day--;
        }
        System.out.println(sum);
    }
}
