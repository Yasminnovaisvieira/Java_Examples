import java.util.Scanner;

public class Subtracao_Simples {
    public static void main(String[] args) {

        System.out.printf("Olá! Seja bem vindo ao programa que realiza SUBTRAÇÕES.\n\n");

        int resultado = 0;
        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite o número que deseja subtrair: ");
        int num1 = ler.nextInt();

        System.out.printf("Digite quanto será subtraído: ");
        int num2 = ler.nextInt();

        resultado = num1 - num2;

        System.out.printf("\nO resultado da subtração é: %d", resultado);
    }
}
