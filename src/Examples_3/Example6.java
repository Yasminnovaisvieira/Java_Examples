import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Digite um número/opção: ");
        int opcao = read.nextInt();

        switch (opcao) {
            case 1 -> System.out.println("Caso 1");

            case 2 -> System.out.println("Caso 2");

            case 3 -> System.out.println("Caso 3");

            default -> System.out.println("Caso Padrão");
        }
    }
}
