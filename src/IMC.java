import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double resultado = 0.0;

        System.out.print("Digite o peso (KG): ");
        double peso = ler.nextDouble();

        System.out.print("Digite a altura (Metros): ");
        double altura = ler.nextDouble();

        resultado = peso / (altura * altura);

        if (resultado < 18.5) {
            System.out.printf("Por seu IMC ser %.2f, a sua faixa é: BAIXO PESO.\n", resultado);
        }
        else if ((resultado >= 18.5) && (resultado <= 24.9)) {
            System.out.printf("Por seu IMC ser %.2f, a sua faixa é: NORMAL.\n", resultado);
        }
        else if ((resultado >= 25) && (resultado <= 29.9)) {
            System.out.printf("Por seu IMC ser %.2f, a sua faixa é: SOBREPESO.\n", resultado);
        }
        else if ((resultado >= 30) && (resultado <= 34.9)) {
            System.out.printf("Por seu IMC ser %.2f, a sua faixa é: OBESIDADE.\n", resultado);
        }
        else if ((resultado >= 35) && (resultado <= 39.9)) {
            System.out.printf("Por seu IMC ser %.2f, a sua faixa é: OBESIDADE MÓRBIDA 1.\n", resultado);
        }
        else {
            System.out.printf("Por seu IMC ser %.2f, a sua faixa é: OBESIDADE MÓRBIDA 2.\n", resultado);
        }
    }
}
