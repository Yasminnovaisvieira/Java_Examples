public class Desafio {
    public static void main(String[] args) {
        double menos_tres = -3;
        double menos_dois = -2;
        double menos_um = -1;

        double potencia1 = menos_tres / 4;
        double potencia2 = menos_tres / 4;
        double potencia3 = ((Math.pow(3, menos_um)) / 4);

        double numerador = 3 * Math.pow(potencia1, menos_dois) + 6 * potencia3 - 4;
        double divisor = 7 * Math.pow(potencia2, menos_um) + 2;

        double total1 = numerador / divisor;
        double total2 = Math.pow(total1, menos_um);
        double total_final = total2 + 4;

        System.out.printf("O resultado da expressão é: %.2f", total_final);
    }
}
