package one;
import java.lang.Math;
import java.util.Scanner;

public class one{
static int pv;
    static int fv;
    static final double interest = 0.05;
    static int interval;

public static void main(String[] args) {
// TODO Auto-generated method stub
 Scanner scanner = new Scanner(System.in);

       System.out.print("Enter the present value (pv): ");
       int pv = scanner.nextInt();

       System.out.print("Enter the number of years (interval): ");
       int interval = scanner.nextInt();

       final double interest = 0.05;
       int fv = (int) (pv * Math.pow((1 + interest), interval));

       System.out.println("My pv is " + pv + " and after " + interval + " years it would be " + fv);

       scanner.close();
}

}