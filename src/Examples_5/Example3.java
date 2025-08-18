package Examples_5;

import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        // Ctrl + O -> Otimiza as importações do projeto.

        Scanner read = new Scanner(System.in);

        System.out.print("Digite um número: ");
        String numeroEmTexto = read.nextLine();

        try{
            int numeroEmInteiro = Integer.parseInt(numeroEmTexto);
            System.out.printf("\nO número que você digitou foi %d!", numeroEmInteiro);
        }
        catch (NumberFormatException | InputMismatchException error){ // || = |.
            System.out.println("\nFormato incorreto! Digite apenas números.");
        }
        finally { // Sempre executado, independente de qual condição foi rodada.
            // É opcional.
            // Por exemplo, quando há algo que acontece tanto no Try quanto no Catch
            System.out.println("Finally é sempre executado!");
        }
    }
}
