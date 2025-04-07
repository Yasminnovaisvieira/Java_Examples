import java.util.Scanner;

public class Celsius_Fahrenheit {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double convertido = 0.0;

        System.out.print("Olá! O programa irá converter uma temperatura de Celsius (ºC) para Fahrenheit (ºF).\n\n");

        System.out.print("Digite a temperatura em Celsius (ºC): ");
        double tempCelsius = ler.nextDouble();

        convertido = (tempCelsius * 9 / 5) + 32;

        System.out.printf("\nA temperatura %.2f ºC convertido em Fahrenheit é igual a %.2f ºF.", tempCelsius, convertido);
    }
}
