import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double resultado = 0.0;

        System.out.print("Olá! O programa irá calcular o IMC conforme o peso informado.\n\n");

        System.out.print("Digite o seu peso: ");
        double peso = read.nextDouble();

        System.out.print("Digite a sua altura: ");
        double altura = read.nextDouble();

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
