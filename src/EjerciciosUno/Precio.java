package EjerciciosUno;
import java.util.Scanner;

public class Precio {
    public static void main(String[] args) {
        double valorArticulo;
        final double IVA, DESCUENTO;
        Scanner input = new Scanner(System.in);

        System.out.println("Introduzca el valor del producto");
        valorArticulo = input.nextDouble();
        IVA = 0.15;
        DESCUENTO = 0.20;
        double valorConIVA = valorArticulo * (1+IVA);
        System.out.println("El precio con IVA es " + String.format("%.2f", valorConIVA));
        double valorFinalConDescuento = valorConIVA * (1-DESCUENTO);
        System.out.printf("Con el descuento, el precio final es %.2f", valorFinalConDescuento);
    }
}
