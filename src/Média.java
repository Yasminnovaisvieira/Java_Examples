import java.util.Scanner;

public class Média {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double media = 0.0;

        System.out.print("Olá! O programa irá calcular a média de 3 números.\n\n");

        System.out.print("Digite o primeiro número: ");
        double num1 = ler.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = ler.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = ler.nextDouble();

        media = (num1 + num2 + num3) / 2;

        System.out.printf("\nA média de %.2f, %.2f e %.2f é: %.2f", num1, num2, num3, media);
    }
}
