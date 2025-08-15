package Examples_4;

public class Example1 {
    public static void main(String[] args) {
        // Atalho "fori (For crescente)"
        for (int i = 0; i <= 10; i++) {

            if (i % 2 == 0) {
                System.out.printf("O número %s é PAR!\n", i);
            }
            else{
                System.out.printf("O número %s é ÍMPAR!\n", i);
            }
        }

        System.out.println("\n");

        for (int y = 0; y <= 10; y++) {
            if (y % 2 == 0) {
                continue; //Reinicia o laço
            }

            System.out.println(y);
        }

        System.out.println("\n");

        // Laços encadeados
        forExterno: // Dando nome ao FOR como se fosse variável
        for (int x = 0; x < 3; x++) {
            System.out.println("Yasmin");

            for (int z = 0; z < 2; z++) {
                System.out.println("Solange");
                break forExterno;
            }
        }
    }
}
