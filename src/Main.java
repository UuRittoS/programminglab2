
import  java.math.*;

public class Main {



    public static void main(String[] args) {

        //System.out.printf(average3Numbers(100,200,55454));
//
//        for (int i = 0; i < 100; i++) {
//            System.out.println("The result is " +Double.toString((TriangleArea(200, 300)+i) )+" i ="+i );
//        }
        boolean state = true;
        int i =0;

        while (state){
            System.out.println("The result is " +Double.toString((TriangleArea(200, 300)+i) )+" i ="+i );
            i++;
            if(i==100){
                state = true;
            }
        }


    }
    public static String average3Numbers(double x, double y, double z) {

        return Double.toString((x + y + z) / 3) ;
    }

    public static double TriangleArea(double b, double h){
        double Area= 0;
       Area= (b*h)/2;
        return Area;
    }


}
