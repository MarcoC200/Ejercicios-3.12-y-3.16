package ejefactura.interfaz;

import ejefactura.negocio.Factura;

public class PruebaFactura {
    public static void main(String[] args) {
        // Crear instancia con datos válidos
        Factura f1 = new Factura("A123", "Martillo de acero", 5, 15.50);

        // Crear instancia con datos negativos para probar validación
        Factura f2 = new Factura("B456", "Clavos 2 pulgadas", -10, -2.50);

        // Mostrar datos de f1
        System.out.println("FACTURA 1");
        System.out.println("Pieza: " + f1.getNumeroPieza() + " - " + f1.getDescripcionPieza());
        System.out.println("Cantidad: " + f1.getCantidad());
        System.out.println("Precio unitario: " + f1.getPrecioPorArticulo());
        System.out.println("MONTO TOTAL: " + f1.obtenerMontoFactura());

        System.out.println("\n---------------------------\n");

        // Mostrar datos de f2 (deben aparecer en 0 por la validación)
        System.out.println("FACTURA 2 (Validación de negativos)");
        System.out.println("Pieza: " + f2.getNumeroPieza() + " - " + f2.getDescripcionPieza());
        System.out.println("Cantidad ajustada: " + f2.getCantidad());
        System.out.println("Precio ajustado: " + f2.getPrecioPorArticulo());
        System.out.println("MONTO TOTAL: " + f2.obtenerMontoFactura());
    }
}