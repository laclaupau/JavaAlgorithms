package EjerciciosUno;

import java.util.Scanner;

public class Dolar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valorDolar, pesosMexicanos, totalDolares;
        System.out.println("Introduzca el valor actual del dolar");
        valorDolar = input.nextDouble();
        System.out.println("Introduzca la cantidad de pesos mexicanos a convertir");
        pesosMexicanos = input.nextDouble();
        totalDolares = pesosMexicanos / valorDolar;
        System.out.printf("Puede adquirir %.2f dólares", totalDolares);
    }
}
