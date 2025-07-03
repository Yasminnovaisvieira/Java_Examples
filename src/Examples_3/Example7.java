public class Example7 {
    public static void main(String[] args) {

        // "For simples para mostrar a sintaxe.
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

        System.out.println();

        // "For simples para mostrar a sintaxe - Regressivo.
        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }

        System.out.println();

        // "For simples para mostrar a sintaxe - Break.
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
            if (i == 5){
                break;
            }
        }

        System.out.println();

        // "For simples para mostrar a sintaxe - Continue.
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
            if (i % 2 == 0){
                continue;
            }
        }
    }
}
