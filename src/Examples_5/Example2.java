package Examples_5;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite um número: ");
        String numeroEmTexto = read.nextLine();

        // Tipos primitivos: Básicos, salvam apenas valores.
        // WRAPPER = Mais complexos. São objetos (Integer, Double, Character, Boolean). Eles têm valores e funções.
        // OBSERVAÇÃO: Tipos primitivos são todos sempre com letras minúsculas. Wrappers iniciam com letras maiúsculas.
        // Wrappers servem para serem utilizados durante conversões.
        // Sempre que tentar juntar número com string, automaticamente o número irá se comportar como string.

        // Parse.. = Converter tipos de valores.
        int numeroEmInteiro = Integer.parseInt(numeroEmTexto);

        // Declarando variáveis com Wrapper:
        Double numeroEmDouble = Double.parseDouble(numeroEmTexto);

        int numeroParaString = 18;
        String StringDoNumero = Integer.toString(numeroParaString);

        System.out.printf("\nEm inteiro: %d\n", numeroEmInteiro + 18);
        System.out.printf("Em double: %.2f\n", numeroEmDouble + 18);
        System.out.printf("Inteiro para string: %s", StringDoNumero + 18);

    }
}
