import java.util.Scanner;

public class Valor_Absoluto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Olá! O programa irá verificar qual é o valor absoluto de um número.\n\n");

        System.out.print("Digite o número: ");
        int numero = ler.nextInt();

        int valorAbs = Math.abs(numero);

        System.out.printf("O valor absoluto de %d é: %d", numero, valorAbs);
    }
}
