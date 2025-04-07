import java.util.Scanner;

public class Divisao_e_Resto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double resultado = 0.0;
        double resto = 0.0;

        System.out.print("Olá! O programa irá calcular o resultado de uma divisão e, caso tiver, seu resto.\n\n");

        System.out.print("Digite o dividendo: ");
        double dividendo = ler.nextDouble();

        System.out.print("Digite o divisor: ");
        double divisor = ler.nextDouble();

        resultado = dividendo / divisor;
        resto = dividendo % divisor;

        System.out.printf("\nO resultado da divisão é: %.2f", resultado);
        System.out.printf("\nO resto da divisão é: %.2f", resto);
    }
}
