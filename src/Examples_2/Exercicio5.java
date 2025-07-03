import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Olá! O programa irá calcular a área de um triângulo.\n\n");

        System.out.print("Digite a base do triângulo: ");
        double base = read.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        double altura = read.nextDouble();

        double area = (base * altura) / 2;

        System.out.printf("\nA área do triângulo é: %.2f", area);
    }
}
