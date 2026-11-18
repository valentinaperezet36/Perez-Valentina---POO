package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Ana");
        Jugador jugador2 = new Jugador("Juan");

        System.out.println("Datos iniciales");
        mostrarDatos(jugador1);
        mostrarDatos(jugador2);

        jugador1.ganarPuntos(20);
        jugador2.ganarPuntos(10);
        System.out.println("Después de sumar puntos");
        mostrarDatos(jugador1);
        mostrarDatos(jugador2);

        System.out.println("Intento de sumar -5 puntos a Ana");
        jugador1.ganarPuntos(-5);
        mostrarDatos(jugador1);

        jugador1.subirNivel();
        System.out.println("Después de subir de nivel a Ana");
        mostrarDatos(jugador1);
        mostrarDatos(jugador2);
    }

    // Lee los datos del jugador con sus getters.
    private static void mostrarDatos(Jugador jugador) {
        System.out.println(jugador.getNombre() + " | Nivel: " + jugador.getNivel()
                + " | Puntos: " + jugador.getPuntos());
    }
}
