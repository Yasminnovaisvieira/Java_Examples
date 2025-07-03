import java.util.Scanner;

public class Impar_ou_Par {
    public static void main(String[] args) {

        Scanner verificar = new Scanner(System.in);

        System.out.print("Olá! O programa irá verificar se o número é ÍMPAR ou PAR.\n\n");

        System.out.print("Digite o número: ");
        int numero = verificar.nextInt();

        if (numero % 2 == 0){
            System.out.printf("\n%d é um número PAR!", numero);
        }
        else {
            System.out.printf("\n%d é um número ÍMPAR!", numero);
        }
    }
}
