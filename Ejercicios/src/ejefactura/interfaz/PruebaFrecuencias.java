package ejefactura.interfaz;

import ejefactura.negocio.FrecuenciasCardiacas;
import java.util.Scanner;

public class PruebaFrecuencias {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellido = entrada.nextLine();

        System.out.print("Día de nacimiento: ");
        int d = entrada.nextInt();
        System.out.print("Mes de nacimiento: ");
        int m = entrada.nextInt();
        System.out.print("Año de nacimiento: ");
        int a = entrada.nextInt();

        FrecuenciasCardiacas persona = new FrecuenciasCardiacas(nombre, apellido, d, m, a);

        System.out.println("\n--- DATOS DE LA PERSONA ---");
        System.out.println("Nombre: " + persona.getNombre() + " " + persona.getApellido());
        System.out.println("Nacido el: " + persona.getDia() + "/" + persona.getMes() + "/" + persona.getAño());
        System.out.println("Edad actual: " + persona.calcularEdad() + " años");
        System.out.println("Frecuencia Cardiaca Máxima: " + persona.calcularFrecuenciaMax());
        System.out.println("Rango de Frecuencia Esperada: " + persona.calcularFrecuenciaEsperada());
    }
}