public class AreaCalculator {
   public static double area(double radius){
       if(radius < 0){
           return -1;
       }
       return Math.PI * Math.pow(radius, 2);
   }
   
   public static double area(double a, double b){
        if(a < 0 || b < 0){
           return -1;
       }
       return a * b;
   }
}
