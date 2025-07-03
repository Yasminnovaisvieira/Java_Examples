import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Olá! O programa irá calcular um número elevado ao quadrado e ao cubo.\n\n");

        System.out.print("Digite um número: ");
        double numero = read.nextInt();

        double quadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);

        System.out.printf("\n%.0f elevado ao quadrado: %.0f.\n%.0f elevado ao cubo: %.0f.", numero, quadrado, numero, cubo);
    }
}
