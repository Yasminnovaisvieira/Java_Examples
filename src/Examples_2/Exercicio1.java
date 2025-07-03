import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Olá! O programa irá converter uma temperatura Celsius(ºC) para Fahrenheit(ºF).\n\n");

        System.out.print("Digite a temperatura Celsius que deseja converter: ");
        double tempCelsius = read.nextDouble();

        double tempFahrenheit = (tempCelsius * 9 / 5) + 32;

        System.out.printf("\n%.2fºC é igual a %.2fºF.", tempCelsius, tempFahrenheit);

    }
}
