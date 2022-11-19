package EjerciciosUno;
import java.util.Scanner;

public class Llamada {
    public static void main(String[] args) {
        double costoLlamada, tiempo, costoMinuto;
        Scanner input = new Scanner(System.in);

        System.out.println("Introduzca los minutos de duración de su llamada");
        tiempo = input.nextDouble();
        System.out.println("Introduzca el precio por minuto");
        costoMinuto = input.nextDouble();
        costoLlamada = tiempo * costoMinuto;
        System.out.printf("Su llamada tiene un costo de $%.2f", costoLlamada);
    }
}
