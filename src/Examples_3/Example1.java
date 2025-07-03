import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        String situacao;

        Scanner read = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome_aluno = read.nextLine();

        System.out.print("Digite a média do aluno: ");
        double media_aluno = read.nextDouble();

        System.out.print("Digite a quantidade de faltas do aluno: ");
        int faltas_aluno = read.nextInt();

        read.nextLine();

        System.out.print("Digite 'SIM' ou 'NÃO' para responder se o aluno teve postura ou não: ");
        String postura_aluno = read.nextLine();

        if(media_aluno >= 5.0 && faltas_aluno < 25 && (postura_aluno.equals("SIM") || postura_aluno.equals("sim") || postura_aluno.equals("Sim"))) {
            situacao = "APROVADO!";
        }
        else if (media_aluno < 5.0 && faltas_aluno < 25 && (postura_aluno.equals("SIM") || postura_aluno.equals("sim") || postura_aluno.equals("Sim"))) {
            situacao = "RECUPERAÇÃO!";
        }
        else if (media_aluno >= 5.0 && faltas_aluno >= 25 && (postura_aluno.equals("SIM") || postura_aluno.equals("sim") || postura_aluno.equals("Sim"))) {
            situacao = "SEM FÉRIAS!";
        }
        else if (media_aluno >= 5.0 && faltas_aluno < 25 && (postura_aluno.equals("NÃO") || postura_aluno.equals("não") || postura_aluno.equals("Nao") || postura_aluno.equals("não"))) {
            situacao = "CONVOCADO PARA CONVERSA!";
        } else {
            situacao = "REPROVADO!";
        }
        System.out.printf("\n%s está: %s", nome_aluno, situacao);

        read.close();
    }
}
