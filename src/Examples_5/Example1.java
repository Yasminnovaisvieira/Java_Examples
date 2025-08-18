package Examples_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        // Try - Catch serve para capitar erros.
        // É possível colocar mais CATCHs.
        Scanner read = new Scanner(System.in);

        try{
            int numero = read.nextInt();
            System.out.println(numero);
        }
        catch (InputMismatchException error){ // Erro do Scanner | error é a variável onde armazenamos o erro.
            System.out.println("Digite apenas números!");
        }
    }
}
