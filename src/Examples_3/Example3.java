import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = read.nextInt();

        if(numero % 2 == 0){
            System.out.printf("\n%d é PAR!", numero);
        }
        else{
            System.out.printf("\n%d é ÍMPAR!", numero);
        }
    }
}
