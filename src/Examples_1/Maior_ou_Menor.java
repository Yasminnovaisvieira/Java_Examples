import java.util.Scanner;

public class Maior_ou_Menor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Olá! O programa irá verificar se 2 números atingem ou não essas expectativas:\n\n");
        System.out.print("1 - O primeiro número é maior que 3;\n2 - O segundo número é menor que 4.\n\n");

        System.out.print("Digite o primeiro número: ");
        int num1 = ler.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = ler.nextInt();

        if ((num1 > 3) && (num2 < 4)) {
            System.out.printf("\n%d é MAIOR que 3 e %d é MENOR que 4. Ou seja, as duas expectativas foram alcançadas!", num1, num2);
        }
        else if ((num1 == 3) && (num2 == 4)) {
            System.out.print("\nOs números são iguais aos que estão sendo comparados. Ou seja, as expectativas não foram alcançadas.");
        }
        else if ((num1 < 3) && (num2 < 4)) {
            System.out.printf("\n%d é MENOR que 3 e %d é MENOR que 4. Ou seja, as expectativas foram alcançadas parcialmente", num1, num2);
        }
        else if ((num1 > 3) && (num2 > 4)) {
            System.out.printf("\n%d é MAIOR que 3 e %d é MAIOR que 4. Ou seja, as expectativas foram alcançadas parcialmente", num1, num2);
        }
        else {
            System.out.printf("\n%d é MENOR que 3 e %d é MAIOR que 4. Ou seja, as expectativas não foram alcançadas.", num1, num2);
        }
    }
}
