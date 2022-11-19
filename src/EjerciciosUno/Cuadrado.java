package EjerciciosUno;
import java.util.Scanner;

public class Cuadrado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, altura, area;

        System.out.println("Introduzca la longitud deseada para la base");
        base = input.nextDouble();
        System.out.println("Introduzca la longitud deseada para la altura");
        altura = input.nextDouble();
        area = base * altura;

        System.out.printf("El area del cuadrado es de " + String.format("%.2f", area) + " mts2.");

    }
}
