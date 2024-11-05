package lista02;

import java.util.Scanner;

//Crie um programa que declare duas variáveis para armazenar números reais, solicite que
// o usuário insira os valores e, por fim, verifique e exiba se o primeiro número é maior que o segundo.”
public class Exerc02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num1, num2;

        System.out.print("Insira um número inteiro: ");
        num1 = s.nextInt();

        System.out.print("Insira outro número inteiro: ");
        num2 = s.nextInt();

        boolean compara = num1 > num2;

        System.out.println("O primeiro número é menor que o segundo número: " + compara);


    }

}
