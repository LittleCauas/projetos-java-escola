package lista02;

import java.util.Scanner;

//Crie um programa que declare variáveis para armazenar as idades de duas pessoas. Solicite ao usuário
// que insira a idade da primeira e da segunda pessoa. Em seguida, compare as idades
// e exiba uma mensagem informando se a primeira pessoa é mais velha que a segunda.
public class Exerc04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int idade1, idade2;

        System.out.print("Digite a idade da primeira pessoa: ");
        idade1 = s.nextInt();

        System.out.print("Digite a idade da segunda pessoa: ");
        idade2 = s.nextInt();

        boolean compara = idade1 > idade2;

        System.out.println("A primeira pessoa é mais velha que a segunda pessoa: " + compara);

    }
}
