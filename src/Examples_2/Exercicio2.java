import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Olá! O programa irá converter uma temperatura Fahrenheit(ºF) para Celsius(ºC).\n\n");

        System.out.print("Digite a temperatura Fahrenheit que deseja converter: ");
        double tempFahrenheit = read.nextDouble();

        double tempCelsius = (tempFahrenheit - 32) * 5/9;

        System.out.printf("\n%.2fºF é igual a %.2fºC.", tempFahrenheit, tempCelsius);
    }
}
