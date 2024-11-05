package lista02;

import java.util.Scanner;

//Desenvolva um programa que declare variáveis para armazenar as alturas de duas pessoas.
// Solicite ao usuário que insira as alturas e, em seguida, compare-as. O programa deve exibir
// uma mensagem indicando se a altura da primeira pessoa é maior ou igual à altura da segunda.
public class Exerc07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float altura1, altura2;

        System.out.print("Informe a altura da primeira pessoa: ");
        altura1 = s.nextFloat();

        System.out.print("Informe a altura da segunda pessoa: ");
        altura2 = s.nextFloat();

        boolean compara = altura1 >= altura2;

        System.out.println("A primeira pessoa ou maior ou igual à segunda pessoa: " + compara);
    }
}
