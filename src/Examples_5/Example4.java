package Examples_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Problemática: O programa só aceita números, eles precisam ser maiores ou iguais a 20.
        // Caso forem menores ou outros tipos de texto, o programa solicita para o usuário outro número.
        // O programa só encerra quando atender aos critérios.

        int numero; // Inicializar fora do While para que não existe apenas dele.

        while (true) {
            try {
                System.out.print("Digite um número: ");
                numero = read.nextInt();

                if (numero < 20){
                    System.out.printf("%d é menor do que 20! Tente novamente.\n\n", numero);
                    continue; // Reinicia o laço.
                }

                break;
            }
            catch (InputMismatchException | NumberFormatException error){
                System.out.println("Opa... Você digitou caracteres inválidos! Digite apenas números.\n");
            }

            read.nextLine();
        }
        System.out.printf("O número que você digitou é %d!", numero);
    }
}
