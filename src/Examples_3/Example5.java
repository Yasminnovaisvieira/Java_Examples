import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Digite um número/opção: ");
        int opcao = read.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Caso 1");
                break;
            case 2:
                System.out.println("Caso 2");
                break;
            case 3:
                System.out.println("Caso 3");
                break;
            default:
                System.out.println("Caso Padrão");
        }
    }
}
