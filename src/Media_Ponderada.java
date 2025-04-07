import java.util.Scanner;

public class Media_Ponderada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double resultado = 0.0;

        System.out.print("Olá! O programa irá calcular a média ponderada de 3 números com 3 pesos diferentes.\n\n");

        System.out.print("Digite a 1ª nota: ");
        double nota1 = ler.nextDouble();

        System.out.print("Digite o 1º peso: ");
        double peso1 = ler.nextDouble();

        System.out.print("Digite a 2ª nota: ");
        double nota2 = ler.nextDouble();

        System.out.print("Digite o 2º peso: ");
        double peso2 = ler.nextDouble();

        System.out.print("Digite a 3ª nota: ");
        double nota3 = ler.nextDouble();

        System.out.print("Digite o 3º peso: ");
        double peso3 = ler.nextDouble();

        resultado = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        System.out.printf("\nLevando em consideração as notas (%.2f, %.2f e %.2f) e os pesos (%.2f, %.2f e %.2f), a média ponderada é: %.2f", nota1, nota2, nota3, peso1, peso2, peso3, resultado);

    }
}
