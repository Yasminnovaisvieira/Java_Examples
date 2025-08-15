package Examples_4;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String valor = "";

        // Independente da condição acontece e depois acontece apenas se entrar na condição (Do - While)
        do{
            System.out.print("Diga me algo: ");
            valor = read.nextLine();
        }
        while(!valor.equalsIgnoreCase("sair"));
        read.close(); // Fecha o Scanner. Para que não atrapalhe nas próximas vezes que for utilizar o Scanner
    }
}
