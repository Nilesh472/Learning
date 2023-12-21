public class Nto1 {
      public static void main(String[] args) {
            concept(5);
      }

      static void func1(int n){
            if(n==0){
                  return;
            }
            func1(n-1);  //priting 1,2,3,4,5
            System.out.println(n);
      }
      static void func2(int n){
            if(n==0){
                  return;
            }
            System.out.println(n); //printing 5,4,3,2,1
            func2(n-1);
            
      }

      static void funcboth(int n){
            if(n==0){
                  return;
            }
            funcboth(n-1);
            System.out.println(n); //printing 1,2,3,4,5,5,4,3,2,1
            funcboth(n-1);
            
      }

      static void concept(int n){
            if(n==0){
                  return;
            }
            System.out.println(n);
            //n--   1st pass then subtract
            concept(--n);//1st subtract then pass
            
      }
}
