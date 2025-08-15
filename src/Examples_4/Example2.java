package Examples_4;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String valor = "";

        // equalsIgnoreCase: Ignora se está maiúsculos ou minúsculo
        // se quiser que seja negativo é só colocar '!' no início: !valor.equalsIgnoreCase("SAIR")
        while(!valor.equalsIgnoreCase("SAIR")){
            System.out.print("Digite algo: ");
            valor = read.nextLine();
        }

        read.close();
    }
}
