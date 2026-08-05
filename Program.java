package POO;

// Problema resolvido sem orientação a objetos

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of triangle X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println();

        System.out.println("Enter the measures of triangle Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p1, p2, areaX, areaY;

        p1 = (xA + xB + xC) / 2.0;
        p2 = (yA + yB + yC) / 2.0;

        // area do triangulo X
        areaX = Math.sqrt(p1 * (p1 - xA) * (p1 - xB) * (p1 - xC));
        // area do triangulo Y
        areaY = Math.sqrt(p2 * (p2 - yA) * (p2 - yB) * (p2 - yC));

        System.out.printf("The Area of Triangle X is: %.4f%n", areaX);
        System.out.printf("The Area of Triangle Y is: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger Area: X");
        } else {
            System.out.println("Larger Area: Y");
        }

        sc.close();

    }
}
