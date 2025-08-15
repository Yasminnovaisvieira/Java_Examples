package Examples_4;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Árvore de exceções - Quando acontece os erros (Erros de compilação e erros no tempo de execução)
        // InputMismatchException = Erro do scanner. Entrada de dados que não está de acordo com o tipo de entrada

        // Finally é como se fosse o else (Opcional)
        try {
            System.out.print("Digite um número: ");
            int numero = read.nextInt();
        }
        // Onde se coloca um erro
        // Todo o erro em Java é um Exception
        // Error é o nome que você define
        catch (Exception error){
            System.out.println("\nDigite apenas números!");
        }
    }
}
