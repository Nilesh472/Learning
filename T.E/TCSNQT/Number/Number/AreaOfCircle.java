public class AreaOfCircle {
      public static void main(String[] args) {
            int r = 5;
            System.out.println(areaOfCircle(r));
      }

      static double areaOfCircle(int r){
            double pi = 3.142;
            double area = pi*r*r;
            return area;
      }
}
