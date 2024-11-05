package lista02;

import java.util.Scanner;

//Escreva um programa que declare variáveis para armazenar os preços de dois produtos.
// Solicite ao usuário que informe o preço do primeiro e do segundo produto. Em seguida,
// compare os preços e exiba uma mensagem indicando se o preço do primeiro produto é menor ou igual ao do segundo.
public class Exerc05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float produto1, produto2;

        System.out.print("Informe o preço do primeiro produto: R$");
        produto1 = s.nextFloat();

        System.out.print("Informe o preço do segundo produto: R$");
        produto2 = s.nextFloat();

        boolean compara = produto1 <= produto2;

        System.out.println("O primeiro produto e menor ou igual ao segundo produto: " + compara);
    }
}
