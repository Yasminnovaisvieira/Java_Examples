import java.util.Scanner;

public class Verifica_Se_Há_Negativo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Olá! O programa irá verificar se há números negativos.\n\n");

        System.out.print("Digite o primeiro número: ");
        int num1 = ler.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = ler.nextInt();

        if ((num1 > 0) && (num2 % 2 > 0)){
            System.out.printf("\n%d e %d são POSITIVOS!", num1, num2);
        }
        else if ((num1 < 0) && (num2 > 0)) {
            System.out.printf("\n%d é NEGATIVO, porém %d é POSITIVO!", num1, num2);
        }
        else if ((num1 > 0) && (num2 < 0)) {
            System.out.printf("\n%d é POSITIVO, porém %d é NEGATIVO!", num1, num2);
        }
        else {
            System.out.printf("\n%d e %d são NEGATIVOS!", num1, num2);
        }
    }
}
