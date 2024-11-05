package lista02;

import java.util.Scanner;
//Desenvolva um programa que declare variáveis para armazenar duas palavras.
// Peça ao usuário que insira as palavras e, em seguida, compare a quantidade de letras de cada uma.
// O programa deve exibir uma mensagem indicando se a primeira palavra possui mais letras do que a segunda.
public class Exerc10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String palavra1, palavra2;

        System.out.print("Informe a primeira palavra: ");
        palavra1 = s.nextLine();

        System.out.print("Informe a segunda palavra: ");
        palavra2 = s.nextLine();

        boolean compara = palavra1.length() > palavra2.length();

        System.out.println("A primeira palavra possui mais letras que a segunda: " + compara);
    }
}
