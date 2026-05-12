public class Gimnasio {
    private Suplemento jug1;
    private Suplemento jug2;
    private Suplemento jug3;

    public Gimnasio(){
        jug1 = new Suplemento("Bastoni", 89, 28, 1.94);
        jug2 = new Suplemento("Yamal", 91, 18, 1.84);
        jug3 = new Suplemento("Raphinha", 90, 28, 1.77);
    }

    public void mejorJugador(){
        if (jug1.getMedia() < 80){
            System.out.println("Jugador malazo");
        } else {
            System.out.println("Buen jugador");
        }
    }
}
