public class Suplemento {
    private String nombre;
    private int media;
    private int edad;
    private double estatura;

    public Suplemento(String nombre, int media, int edad, double estatura) {
        this.nombre = nombre;
        this.media = media;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMedia() {
        return media;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }
}
