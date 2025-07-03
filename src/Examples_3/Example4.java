import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = read.nextInt();

        if (numero % 2 == 0 && numero % 5 == 0) {
            System.out.printf("\n%d é múltiplo de 2 e de 5! FizzBuzz.", numero);
        }
        else if(numero % 2 == 0) {
            System.out.printf("\n%d é múltiplo de 2! Fizz.", numero);
        }
        else if (numero % 5 == 0) {
            System.out.printf("\n%d é múltiplo de 5! Buzz.", numero);
        }
        else {
            System.out.print("\nERRO!");
        }
    }
}