package aula01listaoperadores2;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num1;
        int num2;

        boolean comparar;

        System.out.println("Informe o  primeiro número: " );
        num1 = s.nextInt();

        System.out.println("Informe o  primeiro número: " );
        num2 = s.nextInt();

        comparar = (num1 == num2);

        System.out.println("Os números são iguais: " + comparar);


    }
}
