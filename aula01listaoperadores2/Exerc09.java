package lista02;

import java.util.Scanner;

//Desenvolva um programa que declare variáveis para armazenar os anos de nascimento de duas pessoas.
// Solicite ao usuário que insira os anos de nascimento e, em seguida, compare os valores.
// O programa deve exibir uma mensagem indicando se a primeira pessoa é mais nova do que a segunda.
public class Exerc09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int ano1, ano2;

        System.out.print("Informe o ano de nascimento da primeira pessoa: ");
        ano1 = s.nextInt();

        System.out.print("Informe o ano de nascimneto da segunda pessoa: ");
        ano2 = s.nextInt();

        boolean compara = ano1 > ano2;

        System.out.println("A primeira pessoa e mais nova que a segunda pessoa: " + compara);
    }
}
