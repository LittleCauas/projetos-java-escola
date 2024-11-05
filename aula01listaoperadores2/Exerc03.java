package lista02;
//Desenvolva um programa que declare duas variáveis para armazenar strings e solicite ao usuário
// que insira um texto para cada uma delas. Em seguida, compare os valores das
// duas strings e exiba uma mensagem indicando se elas são diferentes.
import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String texto1, texto2;

        System.out.print("Insira o primeiro texto: ");
        texto1 = s.nextLine();

        System.out.print("Insira o segundo texto: ");
        texto2 = s.nextLine();

        boolean comapara = texto1.equals(texto2);

        System.out.println("Os textos são iguais: " + comapara);





    }
}
