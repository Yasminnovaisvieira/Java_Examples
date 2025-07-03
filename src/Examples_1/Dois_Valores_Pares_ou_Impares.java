import java.util.Scanner;

public class Dois_Valores_Pares_ou_Impares {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Olá! O programa irá verificar se dois números são pares ou não.\n\n");

        System.out.print("Digite o primeiro número: ");
        int num1 = ler.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = ler.nextInt();

        if ((num1 % 2 == 0) && (num2 % 2 == 0)){
            System.out.printf("\n%d e %d são PARES!", num1, num2);
        }
        else if ((num1 % 2 != 0) && (num2 % 2 == 0)) {
            System.out.printf("\n%d é ÍMPAR, porém %d é PAR!", num1, num2);
        }
        else if ((num1 % 2 == 0) && (num2 % 2 != 0)) {
            System.out.printf("\n%d é PAR, porém %d é ÍMPAR!", num1, num2);
        }
        else {
            System.out.printf("\n%d e %d são ÍMPARES!", num1, num2);
        }
    }
}
