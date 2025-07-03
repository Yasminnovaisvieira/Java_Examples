import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Olá! O programa irá resolver questões de 2º Grau.\n\n");

        System.out.print("Digite o valor de A: ");
        double a = read.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = read.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = read.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        System.out.printf("\nO valor do Delta dessa equação é: %.2f", delta);
    }
}
