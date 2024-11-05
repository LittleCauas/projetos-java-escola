package lista02;

import java.util.Scanner;

//Desenvolva um programa que declare variáveis para armazenar duas strings. Solicite ao usuário que insira as
// duas strings e, em seguida, compare os seus tamanhos. O programa deve exibir uma mensagem indicando[
// se o tamanho da primeira string é menor que o tamanho da segunda.
public class Exerc08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String string1, string2;

        System.out.print("Informe a primeira String: ");
        string1 = s.nextLine();

        System.out.print("Informe o segunda String: ");
        string2 = s.nextLine();

        boolean compara = string1.length() < string2.length();

        System.out.println("A primeira String e menor do que a segunda: " + compara);
    }
}
