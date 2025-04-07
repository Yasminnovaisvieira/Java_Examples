import java.util.Scanner;

public class Valor_True_ou_False {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Olá! O programa irá verificar se o 1º número somado com 15 é igual ao 2º número multiplicado por 3.\n\n");

        System.out.print("Digite o primeiro número: ");
        int num1 = ler.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = ler.nextInt();

        boolean resultado = (num1 + 15) == (num2 * 3);

        System.out.printf("\nOs resultados são iguais: %b", resultado);
    }
}
