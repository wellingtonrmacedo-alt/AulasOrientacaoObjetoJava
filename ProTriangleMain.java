package POO;

import java.util.Locale;
import java.util.Scanner;

public class ProTriangleMain {
    
    public static void main(String args[]) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();        

        System.out.println("Enter the measures of triangle X: ");
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();

        System.out.println();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();

        double areaX, areaY;

        areaX = x.area();
        areaY = y.area();
        

        System.out.println("AreaX of triangle is: " + areaX);
        System.out.println("AreaY of triangle is: " + areaY);

        if (areaX > areaY) {
            System.out.println("Larger Area: X");
        } else {
            System.out.println("Larger Area: Y");
        }

        scan.close();
        
    }
}
