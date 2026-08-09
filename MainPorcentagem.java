package POO;

import java.util.Scanner;

public class MainPorcentagem {

    public static void main(String args[]) {

        Porcentagem n1, n2;
        n1 = new Porcentagem();
        n2 = new Porcentagem();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        n1.num1 = sc.nextFloat();

        System.out.println();

        System.out.println("Digite o segundo número: ");
        n2.num2 = sc.nextFloat();

        float calcPorcentagem;

        calcPorcentagem = (n1.num1 / 100) * n2.num2;

        System.out.println("O valor de " + n1.num1 + "% de " + n2.num2 + " é igual a: " + calcPorcentagem);

        sc.close();
    }
}
