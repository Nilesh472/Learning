import java.util.*;
public class Switchcase {
      public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            String fruit = sc.nextLine();

            switch(fruit){
                  case "mango":
                        System.out.println("King of Fruit");
                        break;
                  case "Apple":
                        System.out.println("A sweet red Fruit");
                        break;
                  case "Orange":
                        System.out.println("Round Fruit");
                        break;
                  default:
                        System.out.println("Please enter a valid fruit");
            }
            sc.close();

      }
      
}
