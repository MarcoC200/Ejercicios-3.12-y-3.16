package ejefactura.negocio;

public class FrecuenciasCardiacas {
    private String nombre;
    private String apellido;
    private int dia, mes, año;

    public FrecuenciasCardiacas(String nombre, String apellido, int dia, int mes, int año) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }

    public void setApellido(String apellido) { this.apellido = apellido; }
    public String getApellido() { return apellido; }

    public void setDia(int dia) { this.dia = dia; }
    public int getDia() { return dia; }

    public void setMes(int mes) { this.mes = mes; }
    public int getMes() { return mes; }

    public void setAño(int año) { this.año = año; }
    public int getAño() { return año; }

    public int calcularEdad() {
        return 2026 - año; // Año actual según tu sistema
    }

    public int calcularFrecuenciaMax() {
        return 220 - calcularEdad();
    }

    public String calcularFrecuenciaEsperada() {
        int max = calcularFrecuenciaMax();
        return (max * 0.50) + " - " + (max * 0.85) + " pulsos por minuto";
    }
}