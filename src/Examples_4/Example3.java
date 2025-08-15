package Examples_4;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int contador = 0, acumulador = 0;

        while(contador < 5) {
            if (contador == 4){
                System.out.print("Digite o último número: ");
                acumulador += read.nextInt();
            }
            else {
                System.out.print("Digite um número: ");
                acumulador += read.nextInt();
            }

            read.nextLine();

            System.out.printf("Contador está em %d e o acumulador está em %d\n\n", contador, acumulador);

            contador ++;
        }
    }
}
