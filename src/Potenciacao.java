import java.util.Scanner;

public class Potenciacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double resultado = 0;

        System.out.print("Olá! O programa irá calcular a potência de um número elevado a um expoente.\n\n");

        System.out.print("Digite o número base: ");
        double base = ler.nextDouble();

        System.out.print("Digite o número expoente: ");
        double expoente = ler.nextDouble();

        resultado = Math.pow(base, expoente);

        System.out.printf("%d elevado a %d é igual a %d", base, expoente, resultado);

    }
}
