package ejercicio1;

public class Jugador {
    private String nombre;
    private int nivel;
    private int puntos;

    // Todo jugador arranca en nivel 1 y con 0 puntos.
    public Jugador(String nombre) {
        this.nombre = nombre;
        nivel = 1;
        puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntos() {
        return puntos;
    }

    // Solo suma puntos cuando la cantidad es positiva.
    public void ganarPuntos(int cantidad) {
        if (cantidad > 0) {
            puntos += cantidad;
        } else {
            System.out.println("La cantidad de puntos debe ser positiva.");
        }
    }

    // Avanza un nivel.
    public void subirNivel() {
        nivel++;
    }
}
