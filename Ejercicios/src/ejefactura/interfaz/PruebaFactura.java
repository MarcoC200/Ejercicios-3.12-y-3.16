package ejefactura.interfaz;

import ejefactura.negocio.Factura;
import java.util.Scanner;

public class PruebaFactura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.print("Ingrese número de pieza: ");
        String num = entrada.nextLine();

        System.out.print("Ingrese descripción: ");
        String desc = entrada.nextLine();

        System.out.print("Ingrese cantidad: ");
        int cant = entrada.nextInt();

        System.out.print("Ingrese precio unitario: ");
        double precio = entrada.nextDouble();

        // Crear objeto con los datos ingresados
        Factura f1 = new Factura(num, desc, cant, precio);

        // Mostrar resultados
        System.out.println("\n--- DETALLE DE FACTURA ---");
        System.out.println("Pieza #: " + f1.getNumeroPieza());
        System.out.println("Descripción: " + f1.getDescripcionPieza());
        System.out.println("Cantidad: " + f1.getCantidad());
        System.out.println("Precio Unitario: " + f1.getPrecioPorArticulo());
        System.out.println("TOTAL A PAGAR: " + f1.obtenerMontoFactura());
    }
}