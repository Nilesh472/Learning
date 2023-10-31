public class If_else {
      public static void main(String[] args) {
            int salary = 25000;

            if( salary>= 25000){
                  salary = salary + 1000;
            }
            else if(salary == 25000){
                  salary = salary + 2000;
            }
            else {
                  salary = salary + 3000;
            }
            System.out.println(salary);
      }
      
}
