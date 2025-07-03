import java.util.Scanner;

public class Soma_Simples {
    public static void main(String[] args) {

        System.out.printf("Olá! Seja bem vindo ao programa que realiza SOMAS.\n\n");

        int resultado = 0;
        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite o primeiro número que será somado: ");
        int num1 = ler.nextInt();

        System.out.printf("Digite o segundo número que será somado: ");
        int num2 = ler.nextInt();

        resultado = num1 + num2;

        System.out.printf("\nO resultado da soma é: %d", resultado);

    }
}
