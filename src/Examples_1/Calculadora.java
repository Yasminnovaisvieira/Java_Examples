import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int resultado = 0;
        double resultadoDivisao = 0.0;

        System.out.print("Olá! Seja bem vindo a CALCULADORA da Yasmin.\n\n");

        System.out.print("Entre as opções disponíveis:\n");
        System.out.print("###############################################\n");
        System.out.print("1 - SOMA\n2-SUBTRAÇÃO\n3 - MULTIPLICAÇÃO\n4 - DIVISÃO\n");
        System.out.print("###############################################\n");

        System.out.print("\nDigite o NÚMERO da operação desejada: ");
        int escolha = ler.nextInt();

        if (escolha == 1){
            System.out.print("\nDigite o primeiro número da soma:");
            int num1 = ler.nextInt();

            System.out.print("Digite o segundo número da soma: ");
            int num2 = ler.nextInt();

            resultado = num1 + num2;

            System.out.printf("\nO resultado da soma é: %d", resultado);
        }
        else if (escolha == 2) {
            System.out.print("\nDigite o primeiro número da subtração: ");
            int num1 = ler.nextInt();

            System.out.print("Digite o segundo número da subtração: ");
            int num2 = ler.nextInt();

            resultado = num1 - num2;

            System.out.printf("\nO resultado da subtração é: %d", resultado);
        }
        else if (escolha == 3) {
            System.out.print("\nDigite o primeiro número da multiplicação: ");
            int num1 = ler.nextInt();

            System.out.print("Digite o segundo número da multiplicação: ");
            int num2 = ler.nextInt();

            resultado = num1 * num2;

            System.out.printf("\nO resultado da multiplicação é: %d", resultado);
        }
        else if (escolha == 4) {
            System.out.print("\nDigite o primeiro número da divisão: ");
            double num1 = ler.nextInt();

            System.out.print("Digite o segundo número da divisão: ");
            double num2 = ler.nextInt();

            resultadoDivisao = num1 / num2;

            System.out.printf("\nO resultado da divisão é: %.2f", resultadoDivisao);
        }
        else {
            System.out.print("\nErro! Escolha um número entre as opções oferecidas.");
        }

    }
}
