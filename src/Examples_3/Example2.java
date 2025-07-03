import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Digite o tempo: ");
        int tempo = read.nextInt();

        if(tempo > 90){
            System.out.println("\nO tempo foi maior que 90!");
        }
        else if (tempo > 60) {
            System.out.println("\nO tempo foi maior que 60!");
        }
        else {
            System.out.println("\nO tempo foi menor que 60!");
        }
    }
}
