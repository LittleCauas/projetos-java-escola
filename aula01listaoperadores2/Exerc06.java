package lista02;

import java.util.Scanner;

//Desenvolva um programa que declare variáveis para armazenar dois caracteres. Peça ao usuário
// que insira os dois caracteres e, em seguida, compare-os. O programa deve exibir uma mensagem
// indicando se os caracteres são iguais ou diferentes.
public class Exerc06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char char1, char2;

        System.out.print("Informe o primeiro caractere: ");
        char1 = s.next().charAt(0);

        System.out.print("Informe o segundo caractere: ");
        char2 = s.next().charAt(0);

        boolean compara = char1 == char2;

        System.out.println("Os caracteres informados são iguais: " + compara);

    }
}
